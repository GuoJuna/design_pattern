import com.crp.AbstractLogger;
import com.crp.ConsoleLogger;
import com.crp.ErrorLogger;
import com.crp.FileLogger;

/**
 * @author GuoJun
 * @desc 测试类
 * @since 2022/5/13 18:23
 */
public class ChainPatternDemo {

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO, "这是一个普通信息记录");
        loggerChain.logMessage(AbstractLogger.DEBUG, "这是一个调试级别信息记录");
        loggerChain.logMessage(AbstractLogger.ERROR, "这是一个错误级别信息将");
    }

    private static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}

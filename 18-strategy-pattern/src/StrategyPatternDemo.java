import com.sp.Context;
import com.sp.OperationAdd;
import com.sp.OperationMultiply;
import com.sp.OperationSubtract;

/**
 * @author GuoJun
 * @desc 测试类
 * @since 2022/5/19 18:44
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

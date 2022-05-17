import com.ip.AndExpression;
import com.ip.OrExpression;
import com.ip.TerminalExpression;
import com.ip.iface.Expression;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/17 20:46
 */
public class InterpreterPatternDemo {

    // 规则: 张三 和李四 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("张三");
        Expression john = new TerminalExpression("李四");
        return new OrExpression(robert, john);
    }

    //规则：貂蝉 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("貂蝉");
        Expression married = new TerminalExpression("已婚");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("张三 是男性吗 ? " + isMale.interpret("张三"));
        System.out.println("貂蝉是已婚的吗 ? "
                + isMarriedWoman.interpret("已婚貂蝉"));
    }
}

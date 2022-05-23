import com.op.BinaryObserver;
import com.op.HexObserver;
import com.op.OctalObserver;
import com.op.Subject;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/23 18:45
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("第一次设置15");
        subject.setState(15);

        System.out.println("=======================");
        System.out.println("第二次设置10");
        subject.setState(10);
    }
}

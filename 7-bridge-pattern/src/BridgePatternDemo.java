import com.bp.Circle;
import com.bp.GreenCircle;
import com.bp.RedCircle;
import com.bp.Shape;

/**
 * @author GuoJun
 * @desc 测试类
 * @since 2022/5/5 20:38
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(),100, 100, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}

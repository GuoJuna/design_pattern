import com.fp.ShapeMaker;

/**
 * @author GuoJun
 * @desc 测试类
 * @since 2022/5/10 19:35
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawCircle();
    }
}

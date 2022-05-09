import com.dp.Circle;
import com.dp.Rectangle;
import com.dp.RedShapeDecorator;
import com.dp.ShapeDecorator;
import com.dp.iface.Shape;

/**
 * @author GuoJun
 * @desc 测试类
 * @since 2022/5/9 18:46
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());


        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}

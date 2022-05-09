import com.fp.iface.Shape;
import com.fp.factory.ShapeFactory;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("圆形");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("正方形");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("长方形");
        shape3.draw();

    }
}

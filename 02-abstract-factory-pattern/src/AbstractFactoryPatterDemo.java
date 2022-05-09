import com.afp.factory.AbstractFactory;
import com.afp.factory.FactoryProducer;
import com.afp.iface.Color;
import com.afp.iface.Shape;

public class AbstractFactoryPatterDemo {

    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("形状");

        //获取圆形工厂
        assert shapeFactory != null;
        Shape shape1 = shapeFactory.getShape("圆形");
        shape1.draw();

        //获取长方形工厂
        Shape shape2 = shapeFactory.getShape("长方形");
        shape2.draw();

        //获取正方形工厂
        Shape shape3 = shapeFactory.getShape("正方形");
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("颜色");

        //获取红色工厂
        assert colorFactory != null;
        Color color1 = colorFactory.getColor("红色");
        color1.fill();

        //获取绿色工厂
        Color color2 = colorFactory.getColor("绿色");
        color2.fill();

        //获取蓝色工厂
        Color color3 = colorFactory.getColor("蓝色");
        color3.fill();
    }
}

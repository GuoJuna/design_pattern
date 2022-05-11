import com.fp.Circle;
import com.fp.factory.ShapeFactory;
import com.fp.iface.Shape;

/**
 * @author GuoJun
 * @desc 测试类
 * @since 2022/5/11 21:01
 */
public class FlyweightPatternDemo {
    private static final String colors[] = {"红色", "绿色", "蓝色", "白色", "黑色"};
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

    private static int getRandomX() {
        return (int)(Math.random()*100);
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}

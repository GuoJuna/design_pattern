import com.pp.ProxyImage;
import com.pp.iface.Image;

/**
 * @author GuoJun
 * @desc 测试类
 * @since 2022/5/12 21:23
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("演示.jpg");

        image.display();

    }
}

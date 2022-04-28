import com.pa.Shape;
import com.pa.ShapeCache;

/**
 * @author GuoJun
 * @desc 使用类
 * @since 2022/4/28 19:38
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = ShapeCache.getShape("1");
        System.out.println(cloneShape1.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println(cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println(cloneShape3.getType());
    }
}

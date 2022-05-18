import com.ip.NameRepository;
import com.ip.iface.Iterator;

/**
 * @author GuoJun
 * @desc 测试类
 * @since 2022/5/18 20:34
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("姓名: " + name);
        }
    }
}

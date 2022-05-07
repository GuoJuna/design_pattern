import com.cp.Employee;
import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLMessage;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/7 19:26
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("刘备","大哥", 30000);

        Employee gy = new Employee("关羽", "二哥", 20000);
        Employee zf = new Employee("张飞", "三弟", 20000);

        Employee gClerk1 = new Employee("士兵甲", "关团队", 10000);
        Employee gClerk2 = new Employee("士兵乙", "关团队", 10000);

        Employee zClerk1 = new Employee("士兵丙", "张团队", 10000);
        Employee zClerk2 = new Employee("士兵丁", "张团队", 10000);

        CEO.add(gy);
        CEO.add(zf);

        gy.add(gClerk1);
        gy.add(gClerk2);

        zf.add(zClerk1);
        zf.add(zClerk2);

        System.out.println(CEO);
    }
}

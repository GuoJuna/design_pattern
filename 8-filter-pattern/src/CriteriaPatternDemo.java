import com.fp.*;
import com.fp.iface.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJun
 * @desc 使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表
 * @since 2022/5/6 19:32
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John","Male", "Married"));
        personList.add(new Person("Laura","Female", "Married"));
        personList.add(new Person("Diana","Female", "Single"));
        personList.add(new Person("Mike","Male", "Single"));
        personList.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single,male);
        Criteria singeOrFemale = new OrCriteria(single,female);

        System.out.println("男性: "+male.meetCriteria(personList));

        System.out.println("女性: "+female.meetCriteria(personList));

        System.out.println("单身男性: "+singleMale.meetCriteria(personList));

        System.out.println("单身或女性: "+singeOrFemale.meetCriteria(personList));
    }
}

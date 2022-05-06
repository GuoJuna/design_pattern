package com.fp;

import com.fp.iface.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJun
 * @desc 男人
 * @since 2022/5/6 19:17
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}

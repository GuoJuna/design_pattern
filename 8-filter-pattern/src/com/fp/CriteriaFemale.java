package com.fp;

import com.fp.iface.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJun
 * @desc 女人
 * @since 2022/5/6 19:19
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}

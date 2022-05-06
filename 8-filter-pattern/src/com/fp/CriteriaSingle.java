package com.fp;

import com.fp.Person;
import com.fp.iface.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJun
 * @desc 单身
 * @since 2022/5/6 19:22
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}

package com.fp;

import com.fp.iface.Criteria;

import java.util.List;

/**
 * @author GuoJun
 * @desc and
 * @since 2022/5/6 19:25
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteria);
    }
}

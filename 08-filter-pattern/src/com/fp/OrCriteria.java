package com.fp;

import com.fp.iface.Criteria;

import java.util.List;

/**
 * @author GuoJun
 * @desc or
 * @since 2022/5/6 19:28
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;

    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person otherCriteriaItem : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(otherCriteriaItem)){
                firstCriteriaItems.add(otherCriteriaItem);
            }
        }
        return firstCriteriaItems;
    }
}

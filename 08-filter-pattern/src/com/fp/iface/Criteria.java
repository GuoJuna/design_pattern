package com.fp.iface;

import com.fp.Person;

import java.util.List;

/**
 * @author GuoJun
 * @desc 接口
 * @since 2022/5/6 18:49
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}

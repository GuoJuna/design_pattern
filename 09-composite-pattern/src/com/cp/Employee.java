package com.cp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/7 19:23
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }

    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "员工{" +
                "姓名='" + name + '\'' +
                ", 团队='" + dept + '\'' +
                ", 工资=" + salary +
                ", 下属=" + subordinates +
                '}';
    }
}

package com.rays.Collection.Comparater;

import java.util.Comparator;

public class EmployeeShortById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId() - o2.getId();
        // return o2.getId() - o1.getId();//Desc order
    }
}

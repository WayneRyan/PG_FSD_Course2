package com.wryan;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;

    public Employee(){}

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}

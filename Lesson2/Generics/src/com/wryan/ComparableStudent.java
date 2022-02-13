package com.wryan;

public class ComparableStudent implements Comparable<ComparableStudent>{
    private String name;
    private long id = 0;
    private double gpa = 0.0;

    @Override
    public String toString() {
        return "ComparableStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    public ComparableStudent(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(ComparableStudent s) {
        return this.name.compareTo(s.getName());
    }
}

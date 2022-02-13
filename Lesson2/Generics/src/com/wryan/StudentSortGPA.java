package com.wryan;

import java.util.Comparator;

public class StudentSortGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        double test = s1.getGpa() - s2.getGpa();
        return test > 0 ? 1 : test < 0 ? -1 : 0;
    }
}

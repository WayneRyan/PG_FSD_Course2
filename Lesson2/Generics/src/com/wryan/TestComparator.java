package com.wryan;

import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGPA = new StudentSortGPA();

        studentList.add(new Student("Thomas Jefferson", 1111, 3.8));
        studentList.add(new Student("John Adams", 2222, 3.9));
        studentList.add(new Student("George Washington", 3333, 3.4));

        Collections.sort(studentList, sortName);

        for (Student student : studentList) {
            System.out.println(student);
        }
        Collections.sort(studentList, sortGPA);

        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}

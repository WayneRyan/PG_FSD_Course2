package com.wryan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericArrayList {
    public static void main(String[] args) {
        List<Integer> partList = new ArrayList<>();

        partList.add(1);
        partList.add(2);
        partList.add(3);
//        partList.add("oopa a string!"); // compiler error

        Iterator elements = partList.iterator();
        System.out.println(partList);
        for (int partNumber : partList) {
            System.out.println("Part number: " + partNumber);
        }
    }
}

package com.wryan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OldStyleArrayList {
    public static void main(String[] args) {
        List partList = new ArrayList();

        partList.add(new Integer(1));
        partList.add(new Integer(2));
        partList.add(new Integer(3));
        partList.add("oopa a string!"); // compiler error

        Iterator elements = partList.iterator();
        while (elements.hasNext()) {
            Integer partNumberObject = (Integer) (elements.next());
            int partNumber = (int) partNumberObject.intValue();
            System.out.println("Part number: " + partNumber);
        }
    }
}

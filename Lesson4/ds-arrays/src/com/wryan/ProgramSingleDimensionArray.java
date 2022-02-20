package com.wryan;

public class ProgramSingleDimensionArray {
    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(5);
        singleDimensionArray.insert(0, 10);
        singleDimensionArray.insert(3, 30);
        singleDimensionArray.insert(4, 20);
        singleDimensionArray.insert(1, 20);
        singleDimensionArray.traverseArray();
        System.out.println();
        singleDimensionArray.searchInArray(20);
    }
}

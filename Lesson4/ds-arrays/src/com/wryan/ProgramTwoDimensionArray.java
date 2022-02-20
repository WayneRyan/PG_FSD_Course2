package com.wryan;

public class ProgramTwoDimensionArray {
    public static void main(String[] args) {
        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(3, 3);
        twoDimensionArray.insertValueInTheArray(0, 0, 1);
        twoDimensionArray.insertValueInTheArray(0, 1, 2);
        twoDimensionArray.insertValueInTheArray(0, 2, 3);
        twoDimensionArray.insertValueInTheArray(1, 0, 4);
        twoDimensionArray.insertValueInTheArray(1, 1, 5);
        twoDimensionArray.insertValueInTheArray(1, 2, 6);
        twoDimensionArray.insertValueInTheArray(2, 0, 7);
        twoDimensionArray.insertValueInTheArray(2, 1, 8);
        twoDimensionArray.insertValueInTheArray(2, 2, 9);
        twoDimensionArray.insertValueInTheArray(3, 2, 9);

        twoDimensionArray.traverse2DArray();
        twoDimensionArray.accessCell(1, 2);
        twoDimensionArray.searchingValue(9);
        twoDimensionArray.searchingValue(12);

    }
}

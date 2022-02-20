package com.wryan;

import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            int last = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
        System.out.println(Arrays.toString(array));
    }
}

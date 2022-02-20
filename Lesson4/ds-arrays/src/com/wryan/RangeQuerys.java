package com.wryan;

public class RangeQuerys {
    public static void main(String[] args) {
        int L = 2, R = 5;
        System.out.println("Sum of natural numbers L to R is: " + sumInRange(L, R));
    }

    private static int sumInRange(int l, int r) {
        return sumNatural(r) - sumNatural(l - 1);
    }

    private static int sumNatural(int n) {
        return (n * (n + 1)) / 2;
    }
}

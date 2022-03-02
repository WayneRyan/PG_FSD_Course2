package com.wryan;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] A, int [] B){
        int[] retval = new int[A.length + B.length];
        int i=0, j=0;
        while(i<A.length && j<B.length){
            if (A[i]<B[j]){
                retval[i+j] = A[i++];
            }else{
                retval[i+j] = B[j++];
            }
        }
        while(i<A.length) { retval[i+j] = A[i++];}
        while(j<B.length) { retval[i+j] = B[j++];}
        return retval;
    }

    public static int[] sort(int[] original){
        if (original.length < 2) { return original;}
        int[] left = new int[original.length/2];
        int[] right = new int[original.length - (original.length/2)];
        int i=0,j=0;
        while(i<left.length){left[i] = original[i++];}
        while(j<right.length){right[j] = original[i+j++];}
        left = sort(left);
        right = sort(right);
        return merge(left,right);
    }

    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i=0 ; i<randomArray.length ; i++){
            randomArray[i] = (int)(Math.random()*20);
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(sort(randomArray)));
    }

}

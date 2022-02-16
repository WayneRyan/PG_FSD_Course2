package com.wryan;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubsequence {
    public static void main(String[] args) {
        int[] sequence = {10,22,9,33,21,50,41,60,80};
        int[] memoization = {1,1,1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(sequence));
        int result = 1;
        for (int i=1 ; i<sequence.length ; i++){
            for (int j=0 ; j<i ; j++){
                if (sequence[j] < sequence[i] && memoization[i]<=memoization[j]){
                    int updateVal = memoization[j]+1;
                    memoization[i] = updateVal;
                    if(result<updateVal) result = updateVal;
                }
            }
        }
        System.out.println(Arrays.toString(memoization));
    }
}

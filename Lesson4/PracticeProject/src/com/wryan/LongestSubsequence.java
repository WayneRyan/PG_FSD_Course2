package com.wryan;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubsequence {

    private int[] sequence = new int[0];
    private int[] memoization = new int[0];
    private int[] links = new int[0];
    private int maxVal = 1;
    private int maxIndex = 0;

    private LongestSubsequence(int sequenceLength, int maxValue) {
        sequence = new int[sequenceLength];
        memoization = new int[sequenceLength];
        links = new int[sequenceLength];
        for (int i = 0; i < sequenceLength; i++) {
            sequence[i] = (int) (Math.random() * maxValue);
            memoization[i] = 1;
            links[i] = i;
        }
        System.out.println("The random sequence is:");
        System.out.println(Arrays.toString(sequence));
    }

    public static void main(String[] args) {
        System.out.println("This program computes a longest increasing sequence contained in a random sequence.");
        System.out.println("How long do you want the random sequence to be?");
        int sequenceLength = fetchPositiveInt();
        System.out.println("The sequence will contain random integers from zero to some maximum value.");
        System.out.println("What is the maximum value the sequence should contain?");
        int sequenceMaxValue =  fetchPositiveInt();
        LongestSubsequence ls = new LongestSubsequence(sequenceLength, sequenceMaxValue);
        ls.calculate();
        ls.printLongestSubsequence();
    }

    public static int fetchPositiveInt(){
        int inputValue = -1;
        try {
            Scanner in = new Scanner(System.in);
            while (inputValue<=0){
                inputValue =  in.nextInt();
                if (inputValue<=0) {
                    System.out.println("Please chose a POSITIVE integer");
                }
            }
        } catch (Exception e){
            System.out.println("Something went wrong. Please try again:");
            return fetchPositiveInt();
        }
        return inputValue;
    }


    private void calculate() {
        for (int i = 1; i < sequence.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (sequence[j] < sequence[i] && memoization[i] <= memoization[j]) {
                    int updateVal = memoization[j] + 1;
                    memoization[i] = updateVal;
                    links[i] = j;
                    if (maxVal < updateVal) {
                        maxVal = updateVal;
                        maxIndex = i;
                        break;
                    }
                }
            }
        }
    }

    private void printLongestSubsequence() {
        printLongestSubsequence(maxIndex);
    }

    private void printLongestSubsequence(int index) {
        if (links[index] != index) {
            printLongestSubsequence(links[index]);
        } else {
            System.out.println("The longest sequence has " + maxVal + " elements.");
            System.out.println("The following is a longest increasing sequence in that random sequence.");
        }
        System.out.println(sequence[index]);
    }

}

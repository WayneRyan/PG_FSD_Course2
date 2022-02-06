package com.wryan;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleRegex {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile(".v");
//        Matcher match = pattern.matcher("mv");
//        boolean result = match.matches();

//        boolean result = Pattern.compile(".v").matcher("mv").matches();
//        System.out.println("Resutl : " + result);

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Enter Pattern");
            Pattern pattern = Pattern.compile(in.nextLine());
            System.out.println("Enter text");
            Matcher matcher = pattern.matcher(in.nextLine());

            boolean found = false;

            while(matcher.find()){
                System.out.println("Found Text " + matcher.group() + "index: " + matcher.start() + " ending index " + matcher.end());
                found = true;
            }
            if (!found) {
                System.out.println("no match found");
            }
        }
    }
}

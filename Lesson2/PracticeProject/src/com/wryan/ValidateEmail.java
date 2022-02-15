package com.wryan;

import java.util.Locale;
import java.util.Scanner;

public class ValidateEmail {
    public static void main(String[] args) {
        String[] allUsers = {"angel", "bubbles", "shimmer", "angelic", "bubbly", "glimmer", "baby", "pink", "little",
                "butterfly", "sparkly", "doll", "sweet", "sparkles", "dolly", "sweetie", "sprinkles", "lolly", "princess",
                "fairy", "honey", "snowflake", "pretty", "sugar", "cherub", "lovely", "blossom"};
        boolean done = false;
        Scanner in = new Scanner(System.in);
        while(!done){
            System.out.println("Please type your user ID: ");
            String input = in.nextLine().trim();
            boolean isValid = false;
            for (String user : allUsers) {
                if(input.equals(user)){
                    isValid = true;
                    break;
                }
            }
            if (isValid) {
                System.out.println("The user name is valid.");
            }else{
                System.out.println("The user name is not valid.");
            }
            System.out.println("Type 'q' to quit or press Enter to continue: ");
            if (in.nextLine().trim().equals("q")){ done = true;}
        }

    }
}

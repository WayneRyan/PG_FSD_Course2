package com.wryan;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while(!done){
            showMainMenu();
            switch (in.nextInt()) {
                case 1 :
                    System.out.println("You typed one");
                    break;
                case 2 :
                    System.out.println("You typed two");
                    doSubMenu();
                    break;
                case 3 :
                    System.out.println("You typed three");
                    done = true;
                    break;
                default:
                    System.out.println("Please select one of the three options");
                    break;
            }
        }
    }

    public static void doSubMenu(){
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while(!done){
            showSubMenu();
            switch (in.nextLine().trim().toLowerCase()) {
                case "a" :
                    System.out.println("You typed 'a'");
                    break;
                case "b" :
                    System.out.println("You typed 'b'");
                    doSubMenu();
                    break;
                case "c" :
                    System.out.println("You typed 'c'");
                    break;
                case "d" :
                    System.out.println("You typed 'd'");
                    done = true;
                    break;
                default:
                    System.out.println("Please select one of the four options");
                    break;
            }
        }
    }

    public static void showMainMenu(){
        System.out.println("Developer: Wayne J. Ryan");
        System.out.println("Application Name: LockedMe.com");
        System.out.println("Please select an option:");
        System.out.println("1) Print current file names");
        System.out.println("2) Enter the sub menu");
        System.out.println("3) Close the application");
    }

    public static void showSubMenu(){
        System.out.println("Please select an option:");
        System.out.println("a) Add a file to the directory list");
        System.out.println("b) Delete a file from the directory list");
        System.out.println("c) Search for a file from the directory listing");
        System.out.println("d) Navigate back to the main menu");
    }
}

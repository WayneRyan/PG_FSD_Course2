package com.wryan;

import java.util.Scanner;

public class UserInterface {


    public static void main(String[] args) {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        while(!done){
            try {
                showMainMenu();
                switch (Integer.parseInt(in.nextLine())) {
                    case 1 :
                        System.out.println(BackendLogic.getFileListing());
                        break;
                    case 2 :
                        doSubMenu();
                        break;
                    case 3 :
                        done = true;
                        break;
                    default:
                        System.out.println("Please select one of the three options");
                        break;
                }
            } catch (Exception e){
                System.out.println("Something went wrong. Please try again.");
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
                    System.out.println("Please type a file name");
                    BackendLogic.createFile(in.nextLine().trim());
                    break;
                case "b" :
                    System.out.println("Please type a file name");
                    BackendLogic.deleteFile(in.nextLine().trim());
                    break;
                case "c" :
                    System.out.println("Please type a search string");
                    System.out.println(BackendLogic.filterFileListing(in.nextLine().trim(), BackendLogic.getFileListing()));
                    break;
                case "d" :
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

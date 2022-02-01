package com.wryan;

import java.util.Scanner;

public class FrontEnd {
    public static void main(String[] args) {
        BackEnd calculator = new BackEnd();
        Scanner in = new Scanner(System.in);
        printInstructions();
        while (true) {
            try {
                System.out.print("Please type a number: ");
                calculator.storeOperand(Double.parseDouble(in.nextLine()));
                System.out.println(calculator);
                System.out.print("Please choose an operation to perform  :");
                String operation = in.nextLine();
                switch (operation){
                    case "q" : return;
                    case "c" : calculator = new BackEnd(); break;
                    default  : calculator.storeOperation(operation);
                }
            } catch (Exception e) {
                System.out.println("Something went wrong. Let's try again.");
            }
        }
    }

    private static void printInstructions(){
        System.out.println("Operations are:");
        System.out.println("+  to add");
        System.out.println("-  to subtract");
        System.out.println("*  to multiply");
        System.out.println("/  to divide");
        System.out.println("q  to quit");
        System.out.println("c to clear the calculator");
    }
}

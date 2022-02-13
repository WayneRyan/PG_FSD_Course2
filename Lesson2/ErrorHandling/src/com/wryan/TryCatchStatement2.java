package com.wryan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryCatchStatement2 {
    public static void main(String[] args) {
        try {
            System.out.println("About to open a file");
            InputStream in = new FileInputStream("missingFile.txt");
            System.out.println("File Open");
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quitting: ");
        } catch (IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quitting: ");
        }
    }
}

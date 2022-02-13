package com.wryan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryCatchStatement3 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            System.out.println("About to open a file");
            in = new FileInputStream("missingFile.txt");
            System.out.println("File Open");
        } catch (IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Quitting: " + e.getMessage());
        } finally {
            try {
                if ( in != null) in.close();
            } catch (IOException e) {
                System.out.println("Failed to close the file");
            }
        }
    }
}

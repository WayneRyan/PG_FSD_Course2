package com.wryan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DeclaringExceptions {

    //declare rule
    public static int readByteFromFile() throws IOException {
        try (InputStream in = new FileInputStream("a.txt")){
            System.out.println("File open");
            return in.read();
        }
    }

    public static void main(String[] args){
        // handle rule
        try {
            int data = readByteFromFile();
        } catch (IOException e) {
            System.out.println(e.getMessage() + e.getClass());
            e.printStackTrace();
        }
    }
}

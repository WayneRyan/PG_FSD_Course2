package com.wryan;

import java.io.*;

public class FilePractice {
    public static void main(String[] args) {
        readA_File();
        writeA_File();
        appendA_File();
    }

    private static void appendA_File() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(new File( "outputFile.txt"), true))) {
            out.write("This is a simple text file.\n");
            out.write("I am appending to the end of it.\n");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeA_File() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(new File( "outputFile.txt")))) {
            out.write("This is my output file.\n");
            out.write("I am writing to it.\n");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readA_File() {
        try (BufferedReader in = new BufferedReader(new FileReader(new File( "inputFile.txt")))) {
            String line = "";
            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.wryan;

import java.io.File;

public class MainClass {
    public static void main(String[] args) {
        doFileListing("C:\\junk");
    }

    public static void doFileListing(String filePath){
        File folder = new File(filePath);
        File[] listOfFiles = folder.listFiles();

        for (File f : listOfFiles) {
            if (f.isFile()) {
                System.out.println("File " + f.getName());
            } else if (f.isDirectory()) {
                System.out.println("Directory " + f.getName());
                doFileListing(filePath + "\\" + f.getName());
            }
        }
    }
}

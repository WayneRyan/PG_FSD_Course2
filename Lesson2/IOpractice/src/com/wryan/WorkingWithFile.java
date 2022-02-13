package com.wryan;

import java.io.File;
import java.io.IOException;

public class WorkingWithFile {
    public static void main(String[] args) {
        File myDir = new File("MyDocs");
        if(myDir.mkdir()){
            System.out.println("The directory is created.");
        }else{
            System.out.println("The directory already exists.");
        }

        File subDir = new File(myDir, "subDir");
        subDir.mkdir();

        File myFile = new File(myDir, "myFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File d = new File(myDir, "Sample.txt");
        if(d.delete()){
            System.out.println(d.getName() + " Deleted ");
        } else {
            System.out.println("Failed");
        }
    }
}

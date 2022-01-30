package com.wryan;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class MainClass {
    
    public static void main(String[] args) {
        System.out.printf(filterFileListing("[junk]", getFileListing("C:\\junk")).toString());

    }

    public static void deleteFile(String filePath){
        File myObj = new File(filePath);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static ArrayList<String> filterFileListing(String searchString, ArrayList<String> fileNames){
        Pattern pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
        ArrayList<String> matchingFileNames = new ArrayList<String>();
        for (String fileName : fileNames) {
            if(pattern.matcher(fileName).find()) {
                matchingFileNames.add(fileName);
            }
        }
        return matchingFileNames;
    }

    public static void createFile(String filePath){
        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getFileListing(String filePath){
        File folder = new File(filePath);
        File[] topLevelFiles = folder.listFiles();
        ArrayList<String> fileNames = new ArrayList<String>();
        for (File f : topLevelFiles) {
            if (f.isFile()) {
                fileNames.add(f.getName());
            } else if (f.isDirectory()) {
                fileNames.addAll(getFileListing(filePath + "\\" + f.getName()));
            }
        }
        return fileNames;
    }
}

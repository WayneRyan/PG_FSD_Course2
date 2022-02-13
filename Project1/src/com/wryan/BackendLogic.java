package com.wryan;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class BackendLogic {

    public static void deleteFile( @NotNull String filePath){
        File myObj = new File(filePath);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static ArrayList<String> filterFileListing( @NotNull String searchString, @NotNull ArrayList<String> fileNames){
        Pattern pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
        ArrayList<String> matchingFileNames = new ArrayList<String>();
        for (String fileName : fileNames) {
            if(pattern.matcher(fileName).find()) {
                matchingFileNames.add(fileName);
            }
        }
        return matchingFileNames;
    }

    public static void createFile( @NotNull String filePath){
        try {
            // TODO: Check if file exists
            // TODO: jail to specific folder
            // TODO: Check for write permissions
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

    public static ArrayList<String> getFileListing( @NotNull String filePath){
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

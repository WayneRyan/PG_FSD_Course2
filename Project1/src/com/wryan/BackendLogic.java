package com.wryan;

import org.jetbrains.annotations.NotNull;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class BackendLogic {

    private static final String baseDirectory = "C:\\junk\\";

    public static boolean checkFileName(@NotNull String fileName){
        return fileName.equals(Paths.get(fileName).getFileName().toString());
    }

    public static void deleteFile( @NotNull String fileName){
        File myObj = createFileObject(fileName);
        if (myObj==null) { return; }
        if ( !myObj.exists()){
            System.out.println(myObj.getName() + " does not exist.");
            return;
        }
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

    private static File createFileObject(@NotNull String fileName) {
        if (!checkFileName(fileName)){
            System.out.println(fileName + " is not a simple file name. This application only accepts simple file names without directory structure.");
            return null;
        }
        File myObj = new File(baseDirectory + fileName);
        if (myObj.isDirectory()){
            System.out.println(myObj.getName() + " is a directory. This application does not accept directory names.");
            return null;
        }
        return myObj;
    }

    public static void createFile( @NotNull String fileName){
        try {
            File myObj = createFileObject(fileName);
            if (myObj==null) { return; }
            if ( myObj.exists()){
                System.out.println(myObj.getName() + " already exists.");
                return;
            }
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("Could not create file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getFileListing(){
        File folder = new File(baseDirectory);
        File[] topLevelFiles = folder.listFiles();
        ArrayList<String> fileNames = new ArrayList<String>();
        for (File f : topLevelFiles) {
            if (f.isFile()) {
                fileNames.add(f.getName());
            }
        }
        return fileNames;
    }
}

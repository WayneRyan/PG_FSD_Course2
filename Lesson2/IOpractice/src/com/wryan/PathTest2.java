package com.wryan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\junk\\MyJunk.txt");
        System.out.format("Path %s exists %b%n", path, Files.exists(path, LinkOption.NOFOLLOW_LINKS));
        System.out.format("Path %s isReadable %b%n", path, Files.isReadable(path));
        System.out.format("Path %s isExecutable %b%n", path, Files.isExecutable(path));

        Path createFile = Paths.get("C:\\junk\\OtherJunk.txt");
        try {
            Files.createFile(createFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

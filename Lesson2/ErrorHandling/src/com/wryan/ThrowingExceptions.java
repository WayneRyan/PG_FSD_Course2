package com.wryan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ThrowingExceptions {

    //declare rule
    public void readFile(String file) throws FileNotFoundException {
        boolean found = findFile(file);
        if(!found) {
            throw new FileNotFoundException("missing file");
        }else{
            // code to read a file
        }
    }

    private boolean findFile(String file) {
        return false;
    }

}

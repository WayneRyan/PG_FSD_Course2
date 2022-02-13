package com.wryan;

import java.io.*;

public class Chaining {
    public static void main(String[] args) {
//        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new BufferedOutputStream(new FileOutputStream("byte-data"))))){
//            int data = 200;
//            dos.write(data);
//        } catch (IOException e){
//            e.printStackTrace();
//        }
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("byte-data")))) {
            int data = dis.read();
            System.out.println("Data is: " + data);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

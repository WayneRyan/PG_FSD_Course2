package com.wryan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
    public static void main(String[] args) {
        new SerializeEmployee();
    }

    public SerializeEmployee() {
        Employee e = new Employee(1, "vinodh");
        try (ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            s.writeObject(e);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

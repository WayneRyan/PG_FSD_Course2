package com.wryan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {
    public static void main(String[] args) {
        new DeSerializeEmployee();
    }

    public DeSerializeEmployee(){
        Employee e = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            e = (Employee) ois.readObject();
        }catch (IOException ex) {
            ex.printStackTrace();
        }catch (ClassNotFoundException cle){
            cle.printStackTrace();
        }
        System.out.println("Deserialized object from employees.ser: " + e);
    }
}

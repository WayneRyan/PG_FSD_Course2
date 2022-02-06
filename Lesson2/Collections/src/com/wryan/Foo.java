package com.wryan;

import java.util.Objects;

public class Foo {
    protected int result = 20; // subclass-friendly declaration
    int num = 25; // default access control
    Double junk = 15.5;
    
    private static final boolean[] switches = new boolean[5];
    
    static {
        System.out.println("Initializing ....");
        for (int i=0 ; i< switches.length ; i++) {
            switches[i] = true;
        }

    }

    public static void main(String[] args) {
        switches[1] = false;
        for (boolean aSwitch : switches) {
            System.out.println(aSwitch);
        }
    }
    public boolean equals(Foo obj) {
        return super.equals(obj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foo foo = (Foo) o;
        return result == foo.result && num == foo.num && Objects.equals(junk, foo.junk);
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(result, num, junk);

    }

    @Override
    public String toString() {
        return "Foo{" +
                "result=" + result +
                ", num=" + num +
                '}';
    }
}

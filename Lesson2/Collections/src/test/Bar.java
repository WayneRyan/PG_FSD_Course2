package test;

import com.wryan.Foo;

public class Bar extends Foo{

    private int sum = 100;

    public void reportSum(){
        sum += result;
//        sum += num; compiler error because num is private
    }
}

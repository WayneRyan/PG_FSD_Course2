package test;

import com.wryan.Foo3;

public class Bar3 extends Foo3 {
    private  int sum = 10;

    public void reportSum(){
        sum += getResult();
    }
}

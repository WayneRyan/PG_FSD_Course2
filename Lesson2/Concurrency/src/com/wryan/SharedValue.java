package com.wryan;

public class SharedValue {

    //potentially shared variable
    private int i;

    public int getNext(){
        return i++;
    }
}

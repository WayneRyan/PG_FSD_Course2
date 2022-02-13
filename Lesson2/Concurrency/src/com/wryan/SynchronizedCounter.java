package com.wryan;

public class SynchronizedCounter {
    private static int i=0;

    public synchronized void increament(){
        i++;
    }

    public synchronized void decrement(){
        i--;
    }

    public synchronized int getValue(){
        return i;
    }
}

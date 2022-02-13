package com.wryan;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {
    private List<Character> buffer = new ArrayList<Character>();

    public synchronized void push(char c) {
        this.notify();
        buffer.add(c);
    }

    public synchronized char pop(){
        char c;
        while (buffer.size() == 0){
            try {
                this.wait();
            }catch (InterruptedException e){

            }
        }
        c = buffer.remove(buffer.size()-1);
        return c;
    }
}

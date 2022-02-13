package com.wryan;

public class ExampleRunnable implements Runnable{

    private String name = "";

    public ExampleRunnable(String me) {
        this.name = me;

    }

    @Override
    public void run() {
        for(int i=0 ; i<10 ; i++){
            System.out.println(name + " i:" + i);
        }
    }
}

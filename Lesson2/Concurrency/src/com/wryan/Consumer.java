package com.wryan;

public class Consumer implements Runnable{

    private SyncStack theStack;

    public Consumer(SyncStack theStack) {
        this.theStack = theStack;
    }

    @Override
    public void run() {
        char c;
        for(int i=0 ; i<200 ; i++){
            c = theStack.pop();
            System.out.println("Consumer: " + c);
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

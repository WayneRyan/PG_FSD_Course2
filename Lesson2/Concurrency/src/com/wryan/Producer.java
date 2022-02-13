package com.wryan;

public class Producer implements Runnable{

    private SyncStack theStack;

    public Producer(SyncStack theStack) {
        this.theStack = theStack;
    }

    @Override
    public void run() {
        char c;
        for(int i=0 ; i<200 ; i++){
            c = (char) (Math.random()*26 +'A');
            theStack.push(c);
            System.out.println("Producer: " + c);
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

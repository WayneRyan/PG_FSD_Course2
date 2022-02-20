package com.wryan;

public class QueueArray {
    int[] arr;
    int numOfElements;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.numOfElements = 0;
        this.beginningOfQueue = 0;
        System.out.println("The Queue is successfully created with size of: " + size);
    }

    public boolean enQueue(int value){
        if(isFull()){
            System.out.println("The Queue is Full");
            return false;
        } else {
            arr[(beginningOfQueue+numOfElements++)%arr.length] = value;
            return true;
        }
    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
            throw new IndexOutOfBoundsException();
        } else {
            numOfElements--;
            return arr[beginningOfQueue++];
        }
    }

    public boolean isFull(){
        return numOfElements == arr.length;
    }

    public boolean isEmpty(){
        return numOfElements == 0;
    }
}

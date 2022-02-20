package com.wryan;

public class TestQueueArray {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(3);
        System.out.println(queueArray.isEmpty());
        System.out.println(queueArray.isFull());
        queueArray.enQueue(4);
        queueArray.enQueue(2);
        queueArray.enQueue(5);
//        queueArray.enQueue(1);
        System.out.println("item: " + queueArray.deQueue());
    }
}

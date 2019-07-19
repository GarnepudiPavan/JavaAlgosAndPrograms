package com.daily.java.DataStructures;

import java.util.Queue;
import java.util.Queue.*;
import java.util.concurrent.LinkedBlockingQueue;

/*
Queue uses First In First Out Policy. Queue is used to implement print spool and
other implementation that involve shared resources management.
 */
public class QueueArray {

    int frontIndex;
    int rearIndex = -1;

    int queueArray[] = new int[10];
    int numberOfItem = 0;

    public boolean isFull() {
        return numberOfItem == queueArray.length - 1;
    }

    public boolean isEmpty() {
        return numberOfItem == 0;
    }

    //Pop or poll return last element from Queue and removes first element from queue
    //In Queue frontIndex must be incremented to remove elements from front

    public int poll() {
        int firstValue = queueArray[frontIndex++];numberOfItem--;
        System.out.println("Value removed from front of queue by incrementing frontIndex of queue is" + " " + firstValue);
        return firstValue;
    }

    //Offer or Push inserts an element at rearIndex of Queue
    public void offer(int element) {
        queueArray[++rearIndex] = element;++numberOfItem;

    }

    public int peek() {
        int firstValueInQueue = queueArray[frontIndex];

        System.out.println("First Element in Queue is" + " " + firstValueInQueue);
        return firstValueInQueue;
    }

    public static void main(String args[]) {

        QueueArray obj1 = new QueueArray();

        obj1.offer(1);
        obj1.offer(2);
        obj1.offer(3);
        obj1.peek();
        obj1.poll();
        obj1.peek();
        obj1.poll();
        obj1.poll();
        if (obj1.isEmpty()) {
            System.out.println("Success");
        }

        Queue<String> inBuiltQueue = new LinkedBlockingQueue<>();

        inBuiltQueue.offer("success");
        inBuiltQueue.offer("is here");
        inBuiltQueue.peek();
        inBuiltQueue.poll();
        inBuiltQueue.poll();
        if(inBuiltQueue.isEmpty())System.out.println("Success with"+" "+"Java inbuilt queue");

    }


}

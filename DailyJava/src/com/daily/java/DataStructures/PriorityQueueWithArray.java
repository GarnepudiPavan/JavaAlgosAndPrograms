package com.daily.java.DataStructures;

/*
 * Priority Queues and Heap details
 * https://www.youtube.com/watch?v=wptevk0bshY
 */


public class PriorityQueueWithArray {

    private int maxSize = 10;
    private int front;
    private int rear;
    int numberOfItem;
    private long[] queueArray;

    public PriorityQueueWithArray(){
        front = 0;
        rear = -1;
        numberOfItem=0;
        queueArray = new long[maxSize];
    }


    public boolean isFull() {
        return (rear == maxSize - 1) || (numberOfItem == maxSize-1);
    }


    public boolean isEmpty() {
        return numberOfItem == 0;
    }

    public long peek() {
        return queueArray[front];
    }

    public void enqueue(long e) {
        int j;

            if (numberOfItem == 0) {
                queueArray[numberOfItem++] = e;
            } else if (!isFull()) { //if queue is not full
//iterate from n-1 (end) of the index and keep shifting elements up the index to accommodate new element.
                for (j = (numberOfItem - 1); j >= 0; j--) {
                    if (e < queueArray[j]) {//Change to > if we want to give priority to minimum values
                        queueArray[j + 1] = queueArray[j];
                    } else {

                        break;
                    }

                }
                queueArray[j + 1] = e; //insert new element in correct position
                ++numberOfItem;
            }

    }

    public long dequeue() {
        if (!isEmpty()) {

            return queueArray[--numberOfItem]; // Increment front pointer to point to
            // the next available data element.
        } else {
            System.out.println("Queue is empty. Please insert some data" + " " + rear);
            return -1;
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PriorityQueueWithArray obj1 = new PriorityQueueWithArray();
        long temp1 = 0;
        System.out.println("Inserting into queue based on priority");
		
		  obj1.enqueue(1); obj1.enqueue(0); obj1.enqueue(2);
		  
		  
		   long temp = obj1.dequeue(); 
		  System.out.println("Element deleted from Queue are" + " " + temp);
		  
		  while (!obj1.isEmpty()) {
		  
		  temp1 = obj1.dequeue(); System.out.println("Element deleted from Queue are" +
		  " " + temp1); }
		 
        
        
    }

}

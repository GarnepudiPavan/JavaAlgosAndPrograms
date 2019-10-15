package com.daily.java.DataStructures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueSimple implements Comparable<PriorityQueueSimple> {

    int age;
    String Name;

    public PriorityQueueSimple( String Name, int age){
        this.Name = Name;
        this.age = age;
    }

    public int compareTo(PriorityQueueSimple obj){
        if(this.age==obj.age){
            return 0;
        }else if(this.age > obj.age){
            return -1;
        }else{
            return 1;
        }
    }

    public String toString(){

        return  this.Name+" "+this.age;
    }
    public static void main(String args[]){
        Queue<PriorityQueueSimple> pQueue = new PriorityQueue<PriorityQueueSimple> ( );
        PriorityQueueSimple obj1 = new PriorityQueueSimple("Arjun", 51);
        PriorityQueueSimple obj2 = new PriorityQueueSimple("Yudhistir", 55);
        PriorityQueueSimple obj3 = new PriorityQueueSimple("Bheem", 53);
        PriorityQueueSimple obj4 = new PriorityQueueSimple("Nakul", 45);
        PriorityQueueSimple obj5 = new PriorityQueueSimple("Sahadev", 46);
        pQueue.offer ( obj1 );
        pQueue.offer ( obj2 );
        pQueue.offer ( obj3 );
        pQueue.offer ( obj4 );
        pQueue.offer ( obj5 );
        while(!pQueue.isEmpty ()){
            System.out.println ( "Sorted values from Priority Queue"+" "+  pQueue.poll () );
        }
    }


}

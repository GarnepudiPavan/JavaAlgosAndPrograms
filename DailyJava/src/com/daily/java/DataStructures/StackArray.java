package com.daily.java.DataStructures;

/*
Stack implements LIFO policy i.e Last In First Out.
It is used in situations such as implementation of undo/redo in documents.
Maintaining time stamp for Back-up and restore etc.

 */


import java.util.Scanner;

public class StackArray {

    int top = -1;
    int stackArray[] = new int[10];

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    public int peek() {
        int setValue = stackArray[top];
        System.out.println("Value at top of Stack is "+" "+setValue);
        return setValue;
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot delete from empty stack");
            return -1;
        }
    }

    public void push(int element) {
        if (!isFull()) {
            stackArray[++top] = element;
        } else {
            System.out.println("Cannot insert stack is fullll....");
            return;
        }
    }

    public int getValues(){
        System.out.println("Enter an +ve integer");
        Scanner getValues = new Scanner(System.in);
        return Integer.parseInt(getValues.nextLine());
    }
    public static void main(String args[]) {

        StackArray obj1 = new StackArray();

        obj1.push(obj1.getValues());
        obj1.push(obj1.getValues());
        obj1.push(obj1.getValues());
        obj1.peek();
        System.out.println("Popping out one value from Stack"+" "+obj1.pop());
        System.out.println("The peek value from Stack now is"+" "+obj1.peek());

    }


}

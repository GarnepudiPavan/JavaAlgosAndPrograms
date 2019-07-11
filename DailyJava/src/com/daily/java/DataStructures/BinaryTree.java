package com.daily.java.DataStructures;

import static java.lang.System.out;

public class BinaryTree {

    Node root;

    public static void main(String[] args) {

        BinaryTree bin1 = new BinaryTree();

        Node node1 = new Node(5, 10);
        Node node2 = new Node(3, 6);
        Node node3 = new Node(6, 12);
        Node node4 = new Node(1, 2);
        Node node5 = new Node(7, 14);
        Node node6 = new Node(4, 8);
        bin1.addNode(node1);
        bin1.addNode(node2);
        bin1.addNode(node3);
        bin1.addNode(node4);
        bin1.addNode(node5);
        bin1.findMin(node1);
        bin1.findMax(node1);
        //   System.out.println("Given Node present is" + " " + bin1.nodeIsPresent(node6));
        // System.out.println("Search Node is present using FindNode" + " " + bin1.findNode(node6));

           //node1.display();

    }

        public void addNode(Node newNode) {

        int key = newNode.key;


        if (root == null) {
            root = newNode;
            root.display("added root");
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;

                if (parent.key < newNode.key) {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        parent.rightChild.display("added right child");
                        return;
                    }
                } else {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        parent.leftChild.display("added left child");
                        return;
                    }
                }

            }


        }
    }

    public Node findNode(Node node) {
//logic as per Data Structure and Algo book Page 403. This logic return NPE. below nodeIsPresent method works
        Node current = root;
        boolean isNodeFound = false;

        while (current.key != node.key) { //iterate till search is done for key in all nodes of tree from root

            if (node.key < current.key) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        //isNodeFound = current.key == node.key;
        if (current == null) {
            return null;
        } else {
            return current;
        }
    }


    public boolean nodeIsPresent(Node newNode) {

        Node current = root;

        int key = newNode.key;
        boolean isFound = false;
        while (current != null) {
            if (current.key == key) {
                isFound = true;
            }
            if (current.key < key) {
                current = current.rightChild;
            } else {
                current = current.leftChild;
            }

        }

        return isFound;

    }


    public Node findMin(Node newNode) {

        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            current = current.leftChild;
        }
        parent.display("min number");

        return parent;


    }

    public void findMax(Node newNode) {
        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            current = current.rightChild;
        }
        parent.display("highest node");
    }

    public static class Node {
        int data;
        int key;
        Node leftChild;
        Node rightChild;

        public Node(int key) {
            this.key = key;
        }

        public Node(int key, int data) {
            this.data = data;
            this.key = key;
        }

        public int getKey() {
            return this.key;
        }

        public void setKey(int key) {
            this.key = key;
        }


        public void display(String value) {


            out.println("The key value" + " " + value + " " + "is" + " " + key);
            out.println("The data value " + " " + value + " " + "is" + " " + data);

        }

    }
}
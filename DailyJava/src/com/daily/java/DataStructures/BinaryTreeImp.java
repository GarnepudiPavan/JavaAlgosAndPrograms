package com.daily.java.DataStructures;

public class BinaryTreeImp {

    Node root;

    public static class Node {

        int key;
        int data;
        Node leftChild;
        Node rightChild;

        public Node() {

        }

        public Node(int key, int data) {
            this.key = key;
            this.data = data;
        }

        public Node(int key) {
            this.key = key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getKey() {
            return this.key;
        }

        public void display() {
            System.out.println("Node key is" + " " + this.key);
            System.out.println("Node value is" + " " + this.data);
        }

    }

    /**
     * The defining characteristic of a binary search tree is this: A nodes's
     * left child must have a key less than its parent, and a node's right child
     * must have a key greater than or equal to its parent.
     *
     */

    public void addNode(Node newNode) {
      
        int key = newNode.key;
       // int data=newNode.data;
        if (root == null) {
            root = newNode;
            root.display();
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < parent.key) {
                    current = parent.leftChild;
                    // If left child of current parent node is null then insert new node
                    if (current == null) {
                        parent.leftChild = newNode;
                        parent.leftChild.display();
                        return;
                    }
                } else {
                    current = parent.rightChild;
                    // If right child of current parent node is null then insert new node
                    if (current == null) {
                        parent.rightChild = newNode;
                        parent.rightChild.display();
                        return;
                    }
                }
            }
        }

    }

    public void insert(int key, int data) {
        Node newNode = new Node();// New node instance to be used if Parent node
        // is null
        newNode.key = key;
        newNode.data = data;
        if (root == null) {
            root = newNode;
            root.display();
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < parent.key) {
                    current = current.leftChild;
                    // If left child of current parent node is null then insert
                    // a
                    // new node
                    if (current == null) {
                        parent.leftChild = newNode;
                        parent.leftChild.display();
                        return;
                    }
                } else {
                    current = current.rightChild;
                    // If right child of current parent node is null then insert
                    // a new node
                    if (current == null) {
                        parent.rightChild = newNode;
                        parent.rightChild.display();
                        return;
                    }
                }
            }
        }

    }

    public void delete(Node node) {

        if (root == null) {
            return;
        } else {
            Node current = root;
            Node parent = null;
            boolean isLeftChild = true;
            while (current.key != node.key) {//Iterate to find node that matches given node to be deleted
                parent = current;
                if (node.key < parent.key) {
                    isLeftChild = true;
                    current = parent.leftChild;
                } else {
                    isLeftChild = false;
                    current = parent.rightChild;
                }

            }//Deletion of node which has no children that is leaf nodes
            if (current.leftChild == null && current.rightChild == null) {// to
                // ensure
                // node
                // are
                // having
                // no
                // child
                if (current == root) {// if node found is root then delete root
                    root = null;
                }
                if (isLeftChild) {// if node found is left child then set its parent's
                    // leftChild link to null. Then leftChild will be
                    // collected by GC
                    parent.leftChild = null;
                } else { // else set Parent rightChild to null
                    parent.rightChild = null;
                }
            }
        }

    }

    public int findMin(Node current, int n) {
        int count = -1;
        Node last = null;
        current = root;
        if (current != null) {

            while (current != null) {
                count++;

                last = current;
                current = current.leftChild;

                if (count == n) {
                    return last.data;
                }
            }
            return last.data;
        } else {
            return -1;
        }

    }

    public int findMax(Node current) {
        Node last = null;
        current = root;
        if (current != null) {
            while (current != null) {
                last = current;
                current = current.rightChild;

                // System.out.println("Max value is" + " " + last.getKey()+"
                // "+last.data);
            }
            return last.data;
        } else {
            return -1;
        }

    }

    // Time taken to find a node in Tree is O(logN)
    public Node findNode(int key) {

        Node current = root;

        while (current.key != key) {
            if (key < current.key) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }

        }
        return current;
    }

    // traversing a tree in Inorder which travers in increasing sort order

    private void inOrder(Node localRoot) {
        // System.out.println("traversing in Inorder <LeftChild> <Root>
        // <RightChild>....");
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.println("Node Key" + " : " + localRoot.key + " ");
            System.out.println("Node value" + " : " + localRoot.data + " ");
            inOrder(localRoot.rightChild);
        }
    }

    // traversing a tree

    private void postOrder(Node localRoot) {
        // System.out.println("traversing in Post Order <LeftChilD> <RightChild>
        // <Root>....");
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.println("Node Key" + " : " + localRoot.key + " ");
            System.out.println("Node value" + " : " + localRoot.data + " ");

        }
    }

    // traversing a tree

    private void preOrder(Node localRoot) {
        // System.out.println("traversing in PreOrder is <Root> <LeftChild>
        // <RightChild>....");
        if (localRoot != null) {
            System.out.println("Node Key" + " : " + localRoot.key + " ");
            System.out.println("Node value" + " : " + localRoot.data + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BinaryTreeImp obj1 = new BinaryTreeImp();
        Node root = new Node(10, 101);
        Node root1 = new Node(6, 99);
        Node root2 = new Node(4, 98);
        Node root3 = new Node(7, 100);
        Node root4 = new Node(12, 401);
        Node root5 = new Node(11, 400);
        Node root6 = new Node(13, 402);
        obj1.addNode(root);
        obj1.addNode(root1);
        obj1.addNode(root2);
        obj1.addNode(root3);
        obj1.addNode(root4);
        obj1.addNode(root5);
        obj1.addNode(root6);

        // obj1.insert(root3, 31,32);
        // obj1.insert(root4, 41,42);
        System.out.println("traversing in Inorder <LeftChild> <Root> <RightChild>....");
        obj1.inOrder(root);
        System.out.println("traversing in Post-Order <LeftChild> <RightChild> <Root> ....");
        obj1.postOrder(root);
        System.out.println("traversing in Pre-Order <Root> <LeftChild> <RightChild>  ....");
        obj1.preOrder(root);
        /*
         * System.out.println("Inserting new nodes...."); obj1.insert(3, 12);
         * obj1.insert(21, 220); obj1.inOrder(root);
         */
        System.out.println("Find nth Min value in tree" + " " + obj1.findMin(root, 3));
        // System.out.println("Max value is" + " " + obj1.findMax(root));
    }

}

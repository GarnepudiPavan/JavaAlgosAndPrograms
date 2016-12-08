package com.daily.java.DataStructures;

public class TreesImp {

	Node root;

	public static class Node {

		int iData;
		int data;
		Node leftChild;
		Node rightChild;

		public Node() {

		}

		public Node(int iData, int data) {
			this.iData = iData;
			this.data = data;
		}

		public Node(int key) {
			this.iData = key;
		}

		public void setKey(int key) {
			this.iData = key;
		}

		public int getKey() {
			return this.iData;
		}

		public void display() {
			System.out.println("Node key is" + " " + this.iData);
			System.out.println("Node value is" + " " + this.data);
		}

	}

	/*
	 * The defining characteristic of a binary search tree is this: A node’s
	 * left child must have a key less than its parent, and a node’s right child
	 * must have a key greater than or equal to its parent.
	 * 
	 */

	public void addNode(Node newNode) {
		// newNode = new Node();// New node instance to be used if Parent node
		// is null
		int key = newNode.iData;
		// int data=newNode.data;
		if (root == null) {
			root = newNode;
			root.display();
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (key < current.iData) {
					current = current.leftChild;
					// If left child of current parent node is null then insert
					// a new node
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

	public void insert(int key, int data) {
		Node newNode = new Node();// New node instance to be used if Parent node
									// is null
		newNode.iData = key;
		newNode.data = data;
		if (root == null) {
			root = newNode;
			root.display();
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (key < current.iData) {
					current = current.leftChild;
					// If left child of current parent node is null then insert
					// a new node
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

	public void delete() {

	}

	public int findMin(Node current) {
		
		 Node last = null;
		 current = root;
		if (current != null) {
			
			while (current != null) {
				last=current;
				current = current.leftChild;
				
				//System.out.println("Min value is" + " " + last.getKey()+" "+last.data);
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
			while (current!= null) {
				last=current;
				current = current.rightChild;
				
				//System.out.println("Max value is" + " " + last.getKey()+" "+last.data);
			}
			 return last.data;
		} else {
			return -1;
		}

	}

	// Time taken to find a node in Tree is O(logN)
	public Node findKey(int key) {

		Node current = root;

		while (current.iData != key) {
			if (key < current.iData) {
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

	// traversing a tree

	private void inOrder(Node localRoot) {
		System.out.println("traversing....");
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.println("Node Key" + " : " + localRoot.iData + " ");
			System.out.print("Node value" + " : " + localRoot.data + " ");
			inOrder(localRoot.rightChild);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreesImp obj1 = new TreesImp();
		Node root = new Node(10, 101);
		Node root1 = new Node(4, 98);
		Node root2 = new Node(6, 99);
		Node root4 = new Node(7, 100);
		Node root5 = new Node(11, 400);
		Node root6 = new Node(12, 401);
		Node root7 = new Node(13, 402);
		obj1.addNode(root);
		obj1.addNode(root1);
		obj1.addNode(root2);
		obj1.addNode(root4);
		obj1.addNode(root5);
		obj1.addNode(root6);
		obj1.addNode(root7);

		// obj1.insert(root3, 31,32);
		// obj1.insert(root4, 41,42);
		obj1.inOrder(root);
		/*System.out.println("Inserting new nodes....");
		obj1.insert(3, 12);
		obj1.insert(21, 220);
		obj1.inOrder(root);*/
		System.out.println("Min value is" + " " + obj1.findMin(root));
		System.out.println("Max value is" + " " + obj1.findMax(root));
	}

}

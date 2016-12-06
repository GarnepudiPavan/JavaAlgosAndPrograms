package com.daily.java.DataStructures;


public class SinglyLinkedList {

	private Node head;

	public static class Node {

		private int value;
		private Node next = null;

		public Node(int value) {
			this.value = value;

		}

	}

	public SinglyLinkedList() {
		this.head = null;
	}

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	// Read more at
	// http://www.java2blog.com/2014/07/how-to-reverse-linked-list-in-java.html#lq64zGCYePzs0Ild.99

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// Reverse linkedlist using this function
	public static Node reverseLinkedList(Node currentNode) {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}

	// Read more at
	// http://www.java2blog.com/2014/07/how-to-reverse-linked-list-in-java.html#lq64zGCYePzs0Ild.99

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printList(head);
		// Reversing LinkedList
		Node reverseHead = reverseLinkedList(head);
		System.out.println("After reversing");
		list.printList(reverseHead);

		// Read more at
		// http://www.java2blog.com/2014/07/how-to-reverse-linked-list-in-java.html#lq64zGCYePzs0Ild.99
	}

}

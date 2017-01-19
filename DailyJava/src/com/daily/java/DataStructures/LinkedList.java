package com.daily.java.DataStructures;

public class LinkedList {

	// This is the only field of the class. It holds the head of the list
	ListNode head;
	// Length of the linked list
	private int length = -1;

	// This class has a default constructor:
	public LinkedList() {
		length = 0;
	}

	// ListNode as innerClass

	public static class ListNode {
		ListNode next;
		private int data;

		public ListNode(int data, ListNode next) {

			this.data = data;
			this.next = next;
		}

		public ListNode(int data) {

			this.data = data;

		}

		public void setNext(ListNode next) {
			this.next = next;
		}

		public ListNode getNext() {
			return this.next;
		}

		public void setData(int data) {
			this.data = data;
		}

		public int getData() {
			return this.data;
		}

	}

	// Return the first node in the list
	public synchronized ListNode getHead() {
		return head;
	}

	/*
	 * // get length of a List public int getLength(ListNode node) { //int
	 * listLength = 0; ListNode currentNode = head; while (currentNode != null)
	 * { length++; currentNode = currentNode.getNext(); } if (currentNode ==
	 * null) { System.out.println("Tail is present at" + " " + length); } return
	 * length; }
	 */

	// Insert a node at the beginning of the list
	public synchronized void insertAtBegin(ListNode node) {
		node.next = head;// node.setNext(head);// making present head as next by
							// making new node next pointer point to current
							// node at head
		head = node; // passing new node as head
		length++;
	}

	// Insert a node at the end of the list
	public synchronized void insertAtEnd(ListNode node) {

		if (head == null)// Incase of Empty list add new element.
			head = node;
		else {// If list contains elements then iterate from head till last
				// element

			ListNode temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new ListNode(node.getData(), null);

		}

	}

	// Add a new value to the list at a given position.
	// All values at that position to the end move over to make room.
	public void insert(int data, int position) { // fix the position
		if (position < 0) {
			position = 0;
		}
		if (position > length) {
			position = length;
		} // if the list is empty, make it be the only element
		if (head == null) {
			head = new ListNode(data);
		} // if adding at the front of the list...
		else if (position == 0) {
			ListNode node = head;
			ListNode temp = new ListNode(data);
			temp.next = node;
			head = temp;
		} // else find the correct position and insert
		else {
			ListNode current = head;
			ListNode previous = null;
			for (int i = 0; i < position; i += 1) {
				previous = current;
				current = current.next;// points at next node
			}
			ListNode newNode = new ListNode(data);// create instance of new node
													// that needs to be inserted
			previous.setNext(newNode);// setting next of previous node to
										// newNode
			newNode.setNext(current);// Setting new Node's next
		} // the list is now one value longer
		length += 1;
	} // Remove and return the node at the head of the list

	public synchronized ListNode removeFromBegin() {
		ListNode node = head;
		if (node != null) {
			head = node.getNext();
			node.setNext(null);
		}
		length--;
		return node;
	}

	// Remove and return the node at the end of the list
	public synchronized ListNode removeFromEnd() {
		if (head == null)
			return null;
		ListNode p = head, q = null, next = head.getNext();
		if (next == null) {
			head = null;
			return p;
		}
		while (p.next != null) {
			q = p;
			p = p.getNext();
		}

		q.setNext(null);
		length--;
		return p;
	} // Remove a node matching the specified node from the list. // Use
		// equals() instead of == to test for a matched node.

	public synchronized void removeMatched(ListNode node) {
		if (head == null)
			return;
		if (head.getData() == node.getData()) {
			head = head.getNext();
			return;
		}
		ListNode current = head, previous = null;
		while (current != null) {// (q = p.getNext())
			previous = current;
			current = current.next;
			if (current.data == node.getData()) {

				previous.next = current.next;
				current.setNext(null);
				return;
			}
			// p = q;
		}
		// p=q;
	} // Remove the value at a given position. // If the position is less
		// than
		// 0, remove the value at position 0. // If the position is greater
		// than
		// 0, remove the value at the last position.

	// Identify loop in a LinkedList
	public void insertLoop(ListNode node) {
		node = head;
		ListNode previous = null;
		while (node.next != null) {
			previous = node;
			node = node.next;
		}
		node.setNext(previous);

	}

	public void findLoop() {

		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {// Should be set to fast
													// pointer always as it is
													// incrementing twice and
													// will reach end of list
													// quicker
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.println("Loop Exists");
				return;
			} else {

				System.out.println("Loop doesn't exist");
			}

		}

	}

	public void remove(int position) { // fix position
		if (position < 0) {
			position = 0;
		}

		if (position >= length) {
			position = length - 1;
		}
		// if nothing in the list, do nothing
		if (head == null)
			return;
		// if removing the head element...
		if (position == 0) {
			head = head.getNext();
		} // else advance to the correct position and remove
		else {
			ListNode temp = head;
			for (int i = 1; i < position; i += 1) {
				temp = temp.getNext();
			}

			temp.setNext(temp.getNext().getNext());
		}
		// reduce the length of the list
		length -= 1;

	} // Return a string representation of this collection, in the form
		// ["str1","str2",...].

	public String toString() {
		String result = "[";
		if (head == null) {
			return result + "]";
		}
		result = result + head.getData();
		ListNode temp = head.getNext();
		// ;
		while (temp != null) {
			result = result + "," + temp.getData();
			temp = temp.getNext();
		}
		return result + "]";
	}
	// Return // the
	// current
	// length
	// of the list.

	public int length() {
		return length;
	} // Find the position of the first value that is equal to a given
		// value. //
		// The equals method us used to determine equality.

	public int getPosition(int data) { // go looking for the data
		ListNode temp = head;
		int pos = 0;
		while (temp != null) {
			if (temp.getData() == data) {
				// return the position if found
				return pos;

			}
			pos++;// pos += 1;
			temp = temp.next; // temp.getNext();
		} // else return some large value
		return Integer.MIN_VALUE;
	}

	// Remove everything from the list.

	public void clearList() {
		head = null;
		length = 0;
	}

	public ListNode sortList() {
		int temp;
		ListNode node = head;
		for (int i = 0; i < length; i++) {
			while (node.next != null) {
				if (node.getData() > node.next.getData()) {
					temp = node.getData();
					node.setData(node.next.getData());
					node.next.setData(temp);
				}
				node = node.next;
			}
		}
		return node;
	}

	public void reverseList() {

		ListNode current = head;
		ListNode previous = null;
		ListNode next;
		while (current.next != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList1 = new LinkedList();
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(11);
		ListNode node3 = new ListNode(9);
		linkedList1.insert(node1.getData(), 0);
		linkedList1.insertAtBegin(node2);
		System.out.println("Elements in LL " + " " + linkedList1.toString());
		// linkedList1.removeMatched(node2);
		linkedList1.insert(17, 1);
		linkedList1.insert(9, 0);
		System.out.println("Elements in LL " + " " + linkedList1.toString());
		linkedList1.sortList();
		System.out.println("Sorted LL is " + " " + linkedList1.toString());
		// linkedList1.reverseList();
		// System.out.println("Reversed LL is " + " " + linkedList1.toString());
		/*
		 * linkedList1.removeMatched(node3);
		 * System.out.println("Elements in LL " + " " + linkedList1.toString());
		 */
		linkedList1.findLoop();
		linkedList1.insertLoop(node1);
		linkedList1.findLoop();
		// ListNode nodeObj1 = new ListNode(10);
		/*
		 * ListNode nodeObj3 = new ListNode(15); obj1.insertAtBegin(nodeObj1);
		 */
		/*
		 * obj1.insert(11, 2); System.out.println("Length of List is" + " " +
		 * obj1.length); System.out.println("Elements of LL are" + " " +
		 * obj1.toString()); System.out.println("Given Integer is at" + " " +
		 * obj1.getPosition(11) + " " + "position of LinkedList");
		 * obj1.insert(9, 0);
		 * System.out.println("New order of Elements in LL is" + " " +
		 * obj1.toString()); System.out.println("Length of list is" + " " +
		 * obj1.length); obj1.insertAtEnd(nodeObj3); ListNode nodeObj2 = new
		 * ListNode(5); obj1.insertAtBegin(nodeObj2);
		 * System.out.println("New order of Elements in LL is" + " " +
		 * obj1.toString()); System.out.println("Length of List is" + " " +
		 * obj1.length); obj1.removeFromEnd();
		 * System.out.println("Elements in LL after removing from end" + " " +
		 * obj1.toString()); System.out.println("Length of List is" + " " +
		 * obj1.length); obj1.removeFromEnd();
		 * System.out.println("Elements in LL after removing from end" + " " +
		 * obj1.toString()); System.out.println("Length of List is" + " " +
		 * obj1.length); obj1.removeFromEnd();
		 * System.out.println("Elements in LL after removing from end" + " " +
		 * obj1.toString()); System.out.println("Length of List is" + " " +
		 * obj1.length);
		 */
		// nodeObj1.setNext(next);
	}
}

package com.sk.linkedlist;

public class DLL {

	Node head;

	public void insertFirst(int value) {
		Node temp = new Node(value);
		System.out.println(temp+"========"+value);
		temp.next = head;
		temp.prev = null;
		
		if (head != null) {
			System.out.println(head+"----"+value);
			head.prev = null;
		}
		head = temp;
	}

	public void display() {

		
		Node temp=head;
	
		
		while(temp!=null) {
			System.out.println("-->"+temp.value);
			temp=temp.next;
		}
		
		
	}

	class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}

}

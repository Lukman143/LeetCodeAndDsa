package com.sk.linkedlist;

public class LL {

	Node head;
	Node tail;
	int size;

	public LL() {
		this.size = 0;
	}

	public void insertFirst(int value) {

		Node temp = new Node(value);

		temp.next = head;
		head = temp;
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print("-->" + temp.value);
			temp = temp.next;
		}

	}

	public void insertLast(int value) {
		if (tail == null) {
			insertFirst(value);
		}
		Node temp = new Node(value);
		tail.next = temp;
		tail = temp;
		size++;
	}

	public void insert(int value, int index) {
		if (index == 0) {
			insertFirst(value);
			return;
		}
		if (index == size) {
			insertLast(value);
			return;
		}
		Node temp = head;

		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
	}

	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return value;

	}

	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}
		Node scondLast = get(size - 2);
		int value = tail.value;
		tail = scondLast;
		tail.next = null;
		return value;
	}

	public Node get(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		System.out.println(index);
		return temp;
	}

	public int delete(int index) {
		if (index == 0) {
			return deleteFirst();
		}
		if (index == size - 1) {
			return deleteLast();
		}
		Node prev = get(index - 1);
		int value = prev.next.value;
		prev.next = prev.next.next;
		return value;
	}
}
package edu.kis.vh.nursery.collection;

public class IntLinkedList implements IntCollection{

	final int RETURN_VALUE = 0;
	private Node last;
	private int listSize = 0;

	public void push(int i) {
		listSize++;
		if (last == null) last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return RETURN_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return RETURN_VALUE;
		int ret = last.getValue();
		last = last.prev;
		listSize--;
		return ret;
	}

	public int size() {
		return listSize;
	}
}
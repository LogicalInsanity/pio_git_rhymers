package edu.kis.vh.nursery.collection;

public class IntLinkedList {

	final int RETURN_VALUE = -1;
	 private Node last;

	public void push(int i) {
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
		return ret;
	}
}
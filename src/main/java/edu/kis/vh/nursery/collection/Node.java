package edu.kis.vh.nursery.collection;

public class Node {

	private final int value;
	protected Node prev, next;

	public Node(int i) {
		value = i;
	}	
	public int getValue() {
		return value;
	}
}
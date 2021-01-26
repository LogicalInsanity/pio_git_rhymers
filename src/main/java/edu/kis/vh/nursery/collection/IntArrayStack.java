package edu.kis.vh.nursery.collection;

public class IntArrayStack {

	public final int MAX_SIZE = 12;
	public final int FULL = MAX_SIZE-1;
	public final int INITIAL = -1;
	public final int DEFAULT = -1;

	private final int[] numbers = new int[MAX_SIZE];
	private int total = INITIAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INITIAL;
	}

	public boolean isFull() {
		return total == FULL;
	}

	public int peekaboo() {
		if (callCheck())
			return DEFAULT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT;
		return numbers[total--];
	}
	public int getTotal() {
		return total;
	}
}
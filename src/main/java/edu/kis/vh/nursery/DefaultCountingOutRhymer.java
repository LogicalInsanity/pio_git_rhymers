package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	public final int SIZE = 12;
	public final int CALL = -1;

	private int[] numbers = new int[SIZE];
	public int total = CALL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == CALL;
	}

	public boolean isFull() {
		return total == SIZE-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return CALL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return CALL;
		return numbers[total--];
	}
}
package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRhymer {
	private IntArrayStack intArrayStack;

	public DefaultCountingOutRhymer(){
		intArrayStack = new IntArrayStack();
	}
	public DefaultCountingOutRhymer(IntArrayStack i){
		intArrayStack = i;
	}
	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	protected int peekaboo() {
		return intArrayStack.peekaboo();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}
	public int getTotal() {
		return intArrayStack.getTotal();
	}
}
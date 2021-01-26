package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntCollection;

public class DefaultCountingOutRhymer {
	private IntCollection intArrayStack;

	public DefaultCountingOutRhymer(){
		intArrayStack = new IntArrayStack();
	}
	public DefaultCountingOutRhymer(IntArrayStack i){
		intArrayStack = i;
	}
	public void countIn(int in) {
		intArrayStack.push(in);
	}

	public boolean callCheck() {
		return intArrayStack.isEmpty();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	protected int peekaboo() {
		return intArrayStack.top();
	}

	public int countOut() {
		return intArrayStack.pop();
	}
	public int getTotal() {
		return intArrayStack.size();
	}
}
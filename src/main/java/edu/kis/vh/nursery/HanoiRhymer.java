package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
	private int totalRejected = 0;

	
	/** 
	 * @return int
	 */
	public int reportRejected() {
		return totalRejected;
	}

	
	/** 
	 * @param in
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) totalRejected++;
		else super.countIn(in);
	}
}
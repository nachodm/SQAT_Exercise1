public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int frameScore;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		
		frameScore = getFirstThrow() + getSecondThrow();
		
		return frameScore;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		boolean strike = false;
		
		if (getFirstThrow() == 10) {
			strike = true;
		}
		
		return strike;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare() {
		boolean spare = false;
		
		if ((!isStrike()) && (score() == 10)) {
			spare = true;
		}
		return spare;
	}
}

import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame() {}
	
	public BowlingGame (List<Frame> frames, Frame bonus) {
		this.frames = frames;
		this.bonus = bonus;
	}
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		int gameScore = 0;
		
		for (int i = 0; i < frames.size(); i++) {
			gameScore = gameScore + frames.get(i).score();
			if (frames.get(i -1).isStrike()) {
				gameScore = gameScore + frames.get(i).score();
			}
			else if (frames.get(i - 1).isSpare()) {
				gameScore = gameScore + frames.get(i).getFirstThrow();
			}
		}
		
		return gameScore;
	}
}

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
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	// Returns the game score
	public int score(){
		int gameScore = 0;
		Frame auxFrame;
		for (int i = 0; i < frames.size(); i++) { 
			Frame auxFr;
			if (frames.get(i -1).isStrike()) {
			}
			else if (frames.get(i - 1).isSpare()) {
				gameScore = gameScore + frames.get(i - 1).getFirstThrow();
			}
		}
		
		return gameScore;
	}
}

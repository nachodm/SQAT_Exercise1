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
		int bonusStrike = 0;
		boolean strike = false;
		int bonusSpare = 0;
		boolean spare = false;
		
		for (int i = 0; i < frames.size(); i++) {
			if (frames.get(i - 1).isStrike() && strike) {
				strike = true;
				bonusStrike = bonusStrike + frames.get(i).score();
			}
			else if (frames.get(i - 1).isSpare() && spare) {
				bonusSpare = bonusSpare + frames.get(i).getFirstThrow();
			}
			
			if (!frames.get(i - 1).isStrike() || i == frames.size() - 1) {
				strike = false;
				gameScore = gameScore + bonusStrike;
				bonusStrike = 0;
			}
			
			if (!frames.get(i - 1).isSpare() || i == frames.size() - 1) {
				spare = false;
				gameScore = gameScore + bonusSpare;
				bonusSpare = 0;
			}
			gameScore = gameScore + frames.get(i).score();
		}
		
		return gameScore;
	}
}

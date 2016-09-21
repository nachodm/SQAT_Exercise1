import java.util.ArrayList;
import java.util.List;

//Finish time: 16:35
//ID: 105

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
		bonus = new Frame (firstThrow, secondThrow);
	}
	
	// Returns the game score
	public int score(){
		int gameScore = 0;
		int bonusStrike = 0;
		int bonusSpare = 0;
		
		for (int i = 0; i < frames.size(); i++) {
			if ((i < frames.size() - 1 && frames.get(i).isStrike())) {
				bonusStrike = frames.get(i + 1).score();
				if ((i < frames.size() - 2 && frames.get(i + 1).isStrike())) {
					bonusStrike = bonusStrike + frames.get(i +  2).getFirstThrow();
				}
			}
			else if ((i < frames.size() - 1 && frames.get(i).isSpare())) {
				bonusSpare = bonusSpare + frames.get(i + 1).getFirstThrow();
			}
			gameScore = gameScore + frames.get(i).score() + bonusStrike + bonusSpare;
			bonusStrike = 0;
			bonusSpare = 0;
		}
		if (frames.size() == 10) {
			gameScore = gameScore + bonus.score();
		}
		return gameScore;
	}
}

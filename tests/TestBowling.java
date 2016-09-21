import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestBowling {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testsumFrame() {
		Frame frame = new Frame(3, 7);
		assertEquals(10, frame.score());
	}
	
	@Test
	public void testNoStrike() {
		Frame frame = new Frame(3, 7);
		assertEquals(false, frame.isStrike());
	}
	@Test
	public void testStrike() {
		Frame frame = new Frame(10, 0);
		assertEquals(true, frame.isStrike());
	}
	@Test
	public void testspare() {
		Frame frame = new Frame(3, 7);
		assertEquals(true, frame.isSpare());
	}
	
	@Test
	public void testBowlingScore1() {
		List<Frame> fr = new ArrayList<Frame>();
		Frame bonus = new Frame (0, 0);
		BowlingGame bg = new BowlingGame(fr, bonus);
		bg.addFrame(new Frame(2, 2));
		bg.addFrame(new Frame(10, 0));
		bg.addFrame(new Frame(2, 1));
		bg.addFrame(new Frame(2, 8));
		bg.addFrame(new Frame(2, 1));
		bg.addFrame(new Frame(7, 1));
		assertEquals(43, bg.score());
	}
	
	@Test
	public void testMultipleStrikes() {
		List<Frame> fr = new ArrayList<Frame>();
		Frame bonus = new Frame (0, 0);
		BowlingGame bg = new BowlingGame(fr, bonus);
		bg.addFrame(new Frame(10, 0));
		bg.addFrame(new Frame(10, 0));
		bg.addFrame(new Frame(7, 2));
		bg.addFrame(new Frame(3, 6));
		bg.addFrame(new Frame(4, 4));
		bg.addFrame(new Frame(5, 3));
		bg.addFrame(new Frame(3, 3));
		bg.addFrame(new Frame(4, 5));
		bg.addFrame(new Frame(8, 1));
		bg.addFrame(new Frame(2, 6));
		assertEquals(112, bg.score());
	}
	
	@Test
	public void testMultipleSpares() {
		List<Frame> fr = new ArrayList<Frame>();
		Frame bonus = new Frame (0, 0);
		BowlingGame bg = new BowlingGame(fr, bonus);
		bg.addFrame(new Frame(8, 2));
		bg.addFrame(new Frame(5, 5));
		bg.addFrame(new Frame(7, 2));
		bg.addFrame(new Frame(3, 6));
		bg.addFrame(new Frame(4, 4));
		bg.addFrame(new Frame(5, 3));
		bg.addFrame(new Frame(3, 3));
		bg.addFrame(new Frame(4, 5));
		bg.addFrame(new Frame(8, 1));
		bg.addFrame(new Frame(2, 6));
		assertEquals(98, bg.score());
	}
	
	@Test
	public void testSpareLastFrameWithoutBonus() {
		List<Frame> fr = new ArrayList<Frame>();
		Frame bonus = new Frame (0, 0);
		BowlingGame bg = new BowlingGame(fr, bonus);
		bg.addFrame(new Frame(1, 5));
		bg.addFrame(new Frame(3, 6));
		bg.addFrame(new Frame(7, 2));
		bg.addFrame(new Frame(3, 6));
		bg.addFrame(new Frame(4, 4));
		bg.addFrame(new Frame(5, 3));
		bg.addFrame(new Frame(3, 3));
		bg.addFrame(new Frame(4, 5));
		bg.addFrame(new Frame(8, 1));
		bg.addFrame(new Frame(2, 8));
		assertEquals(83, bg.score());
	}

}

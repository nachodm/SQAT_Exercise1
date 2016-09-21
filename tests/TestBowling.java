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
	
	/*@Test
	public void testBowlingScore() {
		List<Frame> fr = new ArrayList<Frame>();
		fr.add(new Frame(2, 1));
		fr.add(new Frame(10, 0));
		fr.add(new Frame(6, 1));
		fr.add(new Frame(2, 1));
		fr.add(new Frame(9, 1));
		fr.add(new Frame(2, 1));
		Frame bonus = new Frame (2, 1);
		BowlingGame bg = new BowlingGame(fr, bonus);
		assertEquals(45, bg.score());
	}*/

}

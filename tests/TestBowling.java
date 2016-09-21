import static org.junit.Assert.*;

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
	public void teststrike() {
		Frame frame = new Frame(3, 7);
		assertEquals(false, frame.isStrike());
	}
	@Test
	public void testspare() {
		Frame frame = new Frame(3, 7);
		assertEquals(true, frame.isSpare());
	}
	
	@Test
	public void testBowlingScore() {
		Bowling Game bg = new BowlingGame ([(3, 5), (3, 7), (3, 1), (10, 0), (3, 1), (1, 2), (0, 10), (1, 1), (10, 0), (4, 6)], (3, 3));
	}

}

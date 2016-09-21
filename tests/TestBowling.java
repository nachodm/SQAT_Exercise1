import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void sumFrame() {
		Frame frame = new Frame(3, 7);
		assertEquals(10, frame.score());
	}
	
	@Test
	public void strike() {
		Frame frame = new Frame(3, 7);
		assertEquals(false, frame.isStrike());
	}
	@Test
	public void spare() {
		Frame frame = new Frame(3, 7);
		assertEquals(true, frame.isSpare());
	}

}

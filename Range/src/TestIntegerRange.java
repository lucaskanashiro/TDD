import static org.junit.Assert.*;

import org.junit.Test;


public class TestIntegerRange {

	@Test
	public void testCreationOfRange() {
		IntegerRange range = new IntegerRange(0,10);
		assertEquals(0, range.getMinimum());
		assertEquals(10, range.getMaximum());
	}

	@Test
	public void testCheckNumberInRange(){
		IntegerRange range = new IntegerRange(0, 10);
		
		assertTrue(range.inRange(5));
		assertFalse(range.inRange(15));
	}
	
	@Test
	public void testIntersectionOfTwoRanges(){
		IntegerRange range1 = new IntegerRange(0,10);
		IntegerRange range2 = new IntegerRange(2,8);
		
		assertTrue(range1.intersectionWith(range2));
	}
}

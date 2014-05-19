import static org.junit.Assert.*;

import org.junit.Test;


public class TestFloatRange {

	@Test
	public void testCreationFloatRange() {
		FloatRange range = new FloatRange((float)1.1, (float)1.9);
		
		assertEquals((float)1.1, range.getMinimum(), 0.0001);
		assertEquals((float)1.9, range.getMaximum(), 0.0001);
	}

	@Test
	public void testCheckNumberInRange(){
		FloatRange range = new FloatRange((float)1.1, (float)1.9);
		
		assertTrue(range.inRange((float)1.4));
		assertFalse(range.inRange((float)2.0));
	}
	
	@Test(expected=RangeNullException.class)
	public void testTwoRangesWithoutIntersection() throws RangeNullException{
		FloatRange range1 = new FloatRange((float)1.1, (float)1.9);
		FloatRange range2 = new FloatRange((float)3.1, (float)3.9);
		
		@SuppressWarnings("unused")
		FloatRange range = range1.intersectionWith(range2);
	}
	
	@Test
	public void testTwoRangesWithIntersection(){
		FloatRange range1 = new FloatRange((float)1.1, (float)1.9);
		FloatRange range2 = new FloatRange((float)1.1, (float)1.5);
	
		assertEquals((float)1.1, range1.intersectionWith(range2));
	}
}

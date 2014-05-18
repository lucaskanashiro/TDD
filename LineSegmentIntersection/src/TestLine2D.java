import static org.junit.Assert.*;

import org.junit.Test;


public class TestLine2D {
	
	private Line2d line;

	@Test(expected=EqualPointsException.class)
	public void testLineCreation() throws EqualPointsException {
		line = new Line2d(1, 2, 1, 2, 3, 4, 3, 4);
	}

	@Test
	public void testEqualSegments() throws EqualPointsException{
		line = new Line2d(1, 2, 3, 4, 1, 2, 3, 4);
		assertTrue(line.equalSegments());
		
		line = new Line2d(1, 2, 3, 4, 5, 6, 7, 8);
		assertFalse(line.equalSegments());
	}
	
	@Test
	public void testSegmentsParallelInAxisY() throws EqualPointsException{
		line = new Line2d(1, 2, 1, 3, 2, 1, 2, 2);
		assertTrue(line.parallelInY());
		
		line = new Line2d(1, 2, 1, 3, 3, 1, 4, 2);
		assertFalse(line.parallelInY());
	}
	
	@Test
	public void testSegmentsParallelInAxisX() throws EqualPointsException{
		line = new Line2d(1, 2, 3, 2, 1, 4, 3, 4);
		assertTrue(line.parallelInX());
		
		line = new Line2d(1, 2, 1, 3, 3, 1, 4, 2);
		assertFalse(line.parallelInX());
	}
	
	@Test
	public void testCalculateAngularFactor() throws EqualPointsException{
		line = new Line2d(1, 2, 3, 4, 5, 6, 7, 8);
		
		assertEquals(1, line.calcAngularFactor1());
		assertEquals(1, line.calcAngularFactor2());
	}
}

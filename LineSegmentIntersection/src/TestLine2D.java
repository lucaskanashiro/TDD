import static org.junit.Assert.*;

import org.junit.Test;


public class TestLine2D {

	@Test(expected=EqualPointsException.class)
	public void testLineCreation() throws EqualPointsException {
		Line2d line = new Line2d(1, 2, 1, 2, 3, 4, 3, 4);
	}

	@Test
	public void testEqualSegments() throws EqualPointsException{
		Line2d line = new Line2d(1, 2, 3, 4, 1, 2, 3, 4);
		assertTrue(line.equalSegments());
	}
}

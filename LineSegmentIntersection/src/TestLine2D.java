import static org.junit.Assert.*;

import org.junit.Test;


public class TestLine2D {

	@Test(expected=EqualPointsException.class)
	public void testLineCreation() {
		Line2d line = new Line2d(1, 2, 1, 2, 3, 4, 3, 4);
	}

}

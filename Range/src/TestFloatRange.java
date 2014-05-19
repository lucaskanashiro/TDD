import static org.junit.Assert.*;

import org.junit.Test;


public class TestFloatRange {

	@Test
	public void testCreationFloatRange() {
		FloatRange range = new FloatRange(1.1, 1.9);
		
		assertEquals(1.1, range.getMinimum());
		assertEquals(1.9, range.getMaximum());
	}

}

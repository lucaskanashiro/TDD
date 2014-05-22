import static org.junit.Assert.*;

import org.junit.Test;


public class TestIntegerStack {

	@Test
	public void testPushSingleValue() {
		IntegerStack stack = new IntegerStack();
		
		stack.push(1);
		
		assertEquals(1, stack.top());
	}

}

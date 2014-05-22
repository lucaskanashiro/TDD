import static org.junit.Assert.*;

import org.junit.Test;


public class TestIntegerStack {

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testTopWithoutElements(){
		IntegerStack stack = new IntegerStack();
		
		stack.top();
	}
	
	@Test
	public void testPushSingleValueAndTop() {
		IntegerStack stack = new IntegerStack();
		
		stack.push(1);
		
		assertEquals(1, stack.top());
	}

	@Test
	public void testPushMoreElementsAndTop(){
		IntegerStack stack = new IntegerStack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		assertEquals(7, stack.top());
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testPopWithoutElements(){
		IntegerStack stack = new IntegerStack();
		
		stack.pop();
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testPopInStackWithOnlyOneValueAndPopAgain(){
		IntegerStack stack = new IntegerStack();
		
		stack.push(1);
		
		assertEquals(1, stack.pop());
		
		stack.pop();
	}
}

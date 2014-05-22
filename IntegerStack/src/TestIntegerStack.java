import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestIntegerStack {

	private IntegerStack stack;
	
	@Before
	public void setUp(){
		this.stack = new IntegerStack();
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testTopWithoutElements(){
		this.stack.top();
	}
	
	@Test
	public void testPushSingleValueAndTop() {
		this.stack.push(1);
		
		assertEquals(1, this.stack.top());
	}

	@Test
	public void testPushMoreElementsAndTop(){
		this.stack.push(1);
		this.stack.push(2);
		this.stack.push(3);
		this.stack.push(4);
		this.stack.push(5);
		this.stack.push(6);
		this.stack.push(7);
		
		assertEquals(7, this.stack.top());
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testPopWithoutElements(){	
		this.stack.pop();
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testPopInStackWithOnlyOneValueAndPopAgain(){	
		this.stack.push(1);
		
		assertEquals(1, this.stack.pop());
		
		this.stack.pop();
	}
	
	@Test
	public void testSeveralPopCallsInSequence(){	
		this.stack.push(1);
		this.stack.push(2);
		this.stack.push(3);
		this.stack.push(4);
		this.stack.push(5);
		this.stack.push(6);
		this.stack.push(7);
		
		assertEquals(7, this.stack.pop());
		assertEquals(6, this.stack.pop());
		assertEquals(5, this.stack.pop());
		assertEquals(4, this.stack.pop());
		assertEquals(3, this.stack.pop());
		assertEquals(2, this.stack.pop());
		
	}
	
	@Test
	public void testCountElementsInStackWithoutElements(){
		assertEquals(0, this.stack.count());
	}
	
	@Test
	public void testcountElementsInStackWith5Elements(){
		this.stack.push(1);
		this.stack.push(2);
		this.stack.push(3);
		this.stack.push(4);
		this.stack.push(5);
		
		assertEquals(5, this.stack.count());
	}
}

import static org.junit.Assert.*;

import org.junit.Test;


public class TestPostfix {

	@Test(expected=IllegalArgumentException.class)
	public void testCreatePostfixWithNullArgument() throws IllegalArgumentException {
		Postfix postfix = new Postfix(null);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreatePostfixWithBlankedString(){
		Postfix postfix = new Postfix("");
	}
	
	@Test
	public void testExpressionWithNumberOnly(){
		Postfix postfix = new Postfix("1 2 3 4 5");
		
		assertEquals("1 2 3 4 5", postfix.convertInfix());
	}
	
	@Test
	public void testIsDigit(){
		Postfix postfix = new Postfix("1 2 3 4 5");
		
		assertTrue(postfix.isDigit('3'));
		assertFalse(postfix.isDigit('a'));
	}
}

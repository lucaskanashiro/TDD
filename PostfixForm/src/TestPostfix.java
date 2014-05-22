import static org.junit.Assert.*;

import org.junit.Test;


public class TestPostfix {

	@Test(expected=IllegalArgumentException.class)
	public void testCreatePostfixWithNullArgument() throws IllegalArgumentException {
		@SuppressWarnings("unused")
		Postfix postfix = new Postfix(null);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreatePostfixWithBlankedString(){
		@SuppressWarnings("unused")
		Postfix postfix = new Postfix("");
	}
	
	@Test
	public void testExpressionWithNumberOnly(){
		Postfix postfix = new Postfix("12345");
		
		assertEquals("12345", postfix.convertInfix());
	}
	
	@Test
	public void testIsDigit(){
		Postfix postfix = new Postfix("12345");
		
		assertTrue(postfix.isDigit('3'));
		assertFalse(postfix.isDigit('a'));
	}
	
	@Test
	public void testIsOperator(){
		Postfix postfix = new Postfix("+-/*");
		
		assertTrue(postfix.isOperator('+'));
		assertFalse(postfix.isOperator('3'));
	}
	
	@Test
	public void testExpressionWithOperatorOnly(){
		Postfix postfix = new Postfix("+-*/");
		
		assertEquals("+*/-", postfix.convertInfix());
	}
	
	@Test
	public void testPrecedenceOfOperator(){
		Postfix postfix = new Postfix("+-*/");
		
		assertEquals(1, postfix.checkOperatorPrecedence('+'));
		assertEquals(1, postfix.checkOperatorPrecedence('-'));
		assertEquals(2, postfix.checkOperatorPrecedence('/'));
		assertEquals(2, postfix.checkOperatorPrecedence('*'));
	}
	
	@Test 
	public void testExpressionWithDiferentPrecedencesOperatorInDifferentPosicions(){
		Postfix postfix = new Postfix("+*-");
		
		assertEquals("*+-", postfix.convertInfix());	
	}
	
	@Test
	public void testExpressionWithNumbersAndOperators(){
		Postfix postfix = new Postfix("1+2*3-4");
		
		assertEquals("123*+4-", postfix.convertInfix());
	}
	
	@Test
	public void testExpressionWithOnlyOneNumber(){
		Postfix postfix = new Postfix("1");
		
		assertEquals("1", postfix.convertInfix());
	}
	
	@Test
	public void testExpressionWithOnlyOneOperator(){
		Postfix postfix = new Postfix("+");
		
		assertEquals("+", postfix.convertInfix());
	}
}

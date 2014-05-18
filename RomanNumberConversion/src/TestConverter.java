import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestConverter {

	private Converter converter;
	
	@Before
	public void setUp(){
		converter = new Converter();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testRomanToIntEmptyString() {
		converter.romanToInt("");
	}

	@Test(expected=IllegalArgumentException.class)
	public void testRomanToIntNonRomanNumber() {
		converter.romanToInt("123");
	}
	
	@Test
	public void testRomanToInt(){
		assertEquals(10, converter.romanToInt("X"));
		assertEquals(16, converter.romanToInt("XVI"));
		assertEquals(14, converter.romanToInt("XIV"));
		assertEquals(4, converter.romanToInt("IV"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIntToRomanWithZeroArgument(){
		converter.intToRoman(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIntToRomanWithNegativeArgument(){
		converter.intToRoman(-5);
	}
}

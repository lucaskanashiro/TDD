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
}

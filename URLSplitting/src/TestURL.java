import static org.junit.Assert.*;

import org.junit.Test;


public class TestURL {

	@Test(expected=IllegalArgumentException.class)
	public void testCreateURLWithBlankedURL() {
		@SuppressWarnings("unused")
		URL url = new URL("");
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreateURLWithInvalidParameter(){
		@SuppressWarnings("unused")
		URL url = new URL("non valid string");
	}
}

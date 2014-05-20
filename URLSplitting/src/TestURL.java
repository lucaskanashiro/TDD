import static org.junit.Assert.*;

import org.junit.Test;


public class TestURL {

	@Test(expected=IllegalArgumentException.class)
	public void testCreationURLWithBlankedURL() {
		@SuppressWarnings("unused")
		URL url = new URL("");
	}

}

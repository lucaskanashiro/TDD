import static org.junit.Assert.*;

import org.junit.Test;


public class TestURL {

	private URL url;
	
	@Test(expected=IllegalArgumentException.class)
	public void testCreateURLWithBlankedURL() {
		this.url = new URL("");
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCreateURLWithInvalidParameter(){
		this.url = new URL("non valid string");
	}
	
	@Test
	public void testGetProtocol(){
		this.url = new URL("https://www.google.com");
		
		assertEquals("https", this.url.getProtocol());
	}
}

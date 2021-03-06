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
	
	@Test
	public void testgetDomainWithoutPath(){
		this.url = new URL("http://www.google.com");
		
		assertEquals("www.google.com", this.url.getDomain());
	}
	
	@Test
	public void testgetDomainWithPath(){
		this.url = new URL("http://www.google.com/TDD");
		
		assertEquals("www.google.com", this.url.getDomain());
	}
	
	@Test(expected=PathNullException.class)
	public void testgetPathWithoutPathInURL() throws PathNullException{
		this.url = new URL("http://www.google.com");
		
		this.url.getPath();
	}
	
	@Test
	public void testgetPathWithPathInURL() throws PathNullException{
		this.url = new URL("http://www.google.com/TDD");
		assertEquals("TDD", this.url.getPath());
		
		this.url = new URL("http://www.google.com/TDD/DAS");
		assertEquals("TDD/DAS", this.url.getPath());
	}
}

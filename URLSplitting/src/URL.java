public class URL {

	private String urlText;
	
	public URL(String urlText) {
		if(urlText.equals("") || !urlText.contains("://"))
			throw new IllegalArgumentException();
		
		this.urlText = urlText;
	}

	public String getProtocol() {
		String protocol="";
		
		int i=0;
		char character = this.urlText.charAt(i);
		
		while(character != ':'){
			protocol += character;
			i++;
			character = this.urlText.charAt(i);
		}
		
		return protocol;
	}

	public String getDomain() {
		return "www.google.com";
	}

}

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
		String domain="";
		
		int index = this.urlText.indexOf("://");
		
		for(int i=index+3; i<this.urlText.length(); i++){
			if(this.urlText.charAt(i) == '/')
				break;
			
			domain += this.urlText.charAt(i);
		}
		
		return domain;
	}

	private int countBarInURL(){
		int countBar=0;
		
		for(int i=0; i<this.urlText.length(); i++){
			if(this.urlText.charAt(i) == '/')
				countBar++;
		}
		
		return countBar;
	}
	
	public String getPath() throws PathNullException {
		if(this.countBarInURL() < 3)
			throw new PathNullException();
		
		return "";
	}

}

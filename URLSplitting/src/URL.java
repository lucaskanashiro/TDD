public class URL {

	private String urlText;
	
	public URL(String urlText) {
		if(urlText.equals("") || !urlText.contains("://"))
			throw new IllegalArgumentException();
		
		this.urlText = urlText;
	}

	public String getProtocol() {
		return "https";
	}

}

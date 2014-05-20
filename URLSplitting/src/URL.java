public class URL {

	public URL(String urlText) {
		if(urlText.equals("") || !urlText.contains("://"))
			throw new IllegalArgumentException();
	}

	public Object getProtocol() {
		// TODO Auto-generated method stub
		return null;
	}

}

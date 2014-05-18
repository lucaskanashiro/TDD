

public class Converter {

	private String roman = "IVXLCDM";
	
	public Converter(){}
	
	public void romanToInt(String number) throws IllegalArgumentException{
		if(number.length() == 0)
			throw new IllegalArgumentException();
		
		boolean ok;
		
		for(int i=0; i<number.length(); i++){
			ok = false;
			
			for(int j=0; j<roman.length(); j++){
				if(number.charAt(i) == roman.charAt(j)) ok = true;
			}
			
			if(!ok) throw new IllegalArgumentException();
		}
	}

}

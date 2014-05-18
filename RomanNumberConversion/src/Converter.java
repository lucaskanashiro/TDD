

public class Converter {

	private String roman = "IVXLCDM";
	
	public Converter(){}
	
	public int romanToInt(String number) throws IllegalArgumentException{
		if(number.length() == 0 || !allCharactersInRange(number))
			throw new IllegalArgumentException();
		
		return 0;
	}

	private boolean allCharactersInRange(String number) {
		boolean ok;
		
		for(int i=0; i<number.length(); i++){
			ok = false;
			
			for(int j=0; j<roman.length(); j++){
				if(number.charAt(i) == roman.charAt(j)) ok = true;
			}
			
			if(!ok) return false;
		}
		
		return true;
	}

}

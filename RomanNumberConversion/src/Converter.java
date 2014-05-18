
import java.util.HashMap;


public class Converter {

	private String roman = "IVXLCDM";
	
	private HashMap<Character,Integer> roman_numerals = new HashMap<Character,Integer>();
	
	public Converter(){
		this.roman_numerals.put('M', 1000);
		this.roman_numerals.put('D', 500);
		this.roman_numerals.put('C', 100);
		this.roman_numerals.put('L', 50);
		this.roman_numerals.put('X', 10);
		this.roman_numerals.put('V', 5);
		this.roman_numerals.put('I', 1);
	}
	
	public int romanToInt(String number) throws IllegalArgumentException{
		if(number.length() == 0 || !allCharactersInRange(number))
			throw new IllegalArgumentException();
		
		int result=0, i=0, maxSize = number.length();
		
		while(i < maxSize){
			if(((i+1) < maxSize) && (roman_numerals.get(number.charAt(i+1)) > roman_numerals.get(number.charAt(i)))){
				result += (roman_numerals.get(number.charAt(i+1)) - roman_numerals.get(number.charAt(i)));
				i+=2;
			}else{
				result += roman_numerals.get(number.charAt(i));
				i++;
			}
		}
		
		return result;
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

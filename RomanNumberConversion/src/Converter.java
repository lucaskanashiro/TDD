
import java.util.HashMap;


public class Converter {

	private HashMap<Character,Integer> roman_numerals = new HashMap<Character,Integer>();
	
	private static int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	
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

			for(String character_roman : letters){
				if(Character.toString(number.charAt(i)).equals(character_roman)) ok = true;
			}
			
			if(!ok) return false;
		}
		
		return true;
	}

	public String intToRoman(int number) {
		if(number <= 0 || number >= 4000)
			throw new IllegalArgumentException();
		
		String result = "";
		
		for(int i=0; i<numbers.length; i++){
			while(number >= numbers[i]){
				result += letters[i];
				number -= numbers[i];
			}
		}
		
		return result;
	}

}

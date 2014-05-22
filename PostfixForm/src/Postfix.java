import java.util.ArrayList;
import java.util.HashMap;


public class Postfix {
	
	private String expression;
	
	public Postfix(String expression) throws IllegalArgumentException {
		if(expression == null || expression.isEmpty())
			throw new IllegalArgumentException();
		
		this.expression = expression;
	}

	public String convertInfix() {
		String convertExpression="";
		ArrayList<Character> operator = new ArrayList<Character>();
		
		for(int index=0; index<this.expression.length(); index++){
			if(isDigit(this.expression.charAt(index))){
				convertExpression += this.expression.charAt(index);
				
				if(index< this.expression.length()-1)
					convertExpression += " ";		
			}	
			
			if(isOperator(this.expression.charAt(index))){
				//convertExpression += this.expression.charAt(index);
				
				operator.add(this.expression.charAt(index));				
				
				//if(index< this.expression.length()-1)
					//convertExpression += " ";
			}
		}
		
		for (int index = 0; index<operator.size()-1; index++){
			convertExpression += this.checkOperatorPrecedence(operator.get(index), operator.get(index+1));
				 
		}
		return convertExpression;
	}

	public boolean isDigit(char character) {
		char[] validDigits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		
		return checkCharacter(character, validDigits);
	}

	private boolean checkCharacter(char character, char[] validDigits) {
		boolean ok=false;
		
		for(int index=0; index<validDigits.length; index++){
			if(character == validDigits[index]){
				ok = true;
				break;
			}
		}
		return ok;
	}

	public boolean isOperator(char character) {
		char[] valisOperators = {'+', '-', '*', '/'};
		
		return checkCharacter(character, valisOperators);
	}

	public char checkOperatorPrecedence(char operator1, char operator2) {
		HashMap<Character, Integer> precedenceOperator = new HashMap<Character, Integer>();
		
		precedenceOperator.put('+', 1);
		precedenceOperator.put('-', 1);
		precedenceOperator.put('*', 2);
		precedenceOperator.put('/', 2);
		
		if(precedenceOperator.get(operator1) == precedenceOperator.get(operator2) ||
				precedenceOperator.get(operator1) > precedenceOperator.get(operator2))
			return operator1;
		else 
			return operator2;
		
	}

}

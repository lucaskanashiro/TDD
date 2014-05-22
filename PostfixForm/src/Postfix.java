
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;


public class Postfix {
	
	private String expression;
	
	public Postfix(String expression) throws IllegalArgumentException {
		if(expression == null || expression.isEmpty())
			throw new IllegalArgumentException();
		
		this.expression = expression;
	}

	public String convertInfix() {
		String convertExpression="";
		//Stack<Character> operator = new Stack<Character>();
		ArrayList<Character> operator = new ArrayList<Character>(); 
		
		for(int index=0; index<this.expression.length(); index++){
			if(isDigit(this.expression.charAt(index))){
				convertExpression += this.expression.charAt(index);		
			}	
			
			if(isOperator(this.expression.charAt(index))){
				operator.add(this.expression.charAt(index));
				/*if(!operator.isEmpty()){
					if(this.checkOperatorPrecedence(operator.firstElement()) < this.checkOperatorPrecedence(this.expression.charAt(index)))
						operator.push(this.expression.charAt(index));
					else{
						while(!operator.isEmpty()){
							if(this.checkOperatorPrecedence(operator.firstElement()) >= this.checkOperatorPrecedence(this.expression.charAt(index)))
								convertExpression += operator.pop();
							else
								break;
						}
						operator.push(this.expression.charAt(index));
					}
				}
				else
					operator.push(this.expression.charAt(index));*/
			}
		}
		
		//while(!operator.isEmpty())
			//convertExpression += operator.pop();
		
		int precedence=2;
		
		for(int i=0; i<2; i++){
			for(int index=0; index<operator.size(); index++){
				if(this.checkOperatorPrecedence(operator.get(index)) == precedence)
					convertExpression += operator.get(index);
			}
			precedence--;
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

	public int checkOperatorPrecedence(char operator) {
		HashMap<Character, Integer> precedenceOperator = new HashMap<Character, Integer>();
		
		precedenceOperator.put('+', 1);
		precedenceOperator.put('-', 1);
		precedenceOperator.put('*', 2);
		precedenceOperator.put('/', 2);
		
		return precedenceOperator.get(operator);
		
	}

}

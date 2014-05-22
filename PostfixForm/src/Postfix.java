
public class Postfix {

	private String expression;
	
	public Postfix(String expression) throws IllegalArgumentException {
		if(expression == null || expression.isEmpty())
			throw new IllegalArgumentException();
		
		this.expression = expression;
	}

	public String convertInfix() {
		String convertExpression="1 2 3 4 5";
		
		/*for(int index=0; index<this.expression.length(); index++){
			
		}*/
		
		return convertExpression;
	}

	public boolean isDigit(char character) {
		char[] validDigits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		
		boolean ok=false;
		
		for(int index=0; index<validDigits.length; index++){
			if(character == validDigits[index]){
				ok = true;
				break;
			}
		}
				
		return ok;
	}

}

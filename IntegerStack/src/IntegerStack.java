import java.util.ArrayList;


public class IntegerStack {
	
	private ArrayList<Integer> stack;
	
	public IntegerStack(){
		this.stack = new ArrayList<Integer>();
	}

	public void push(int number) {
		this.stack.add(number);
	}

	public int top() {
		if(this.stack.isEmpty())
			throw new ArrayIndexOutOfBoundsException();
		
		int lastElement = this.stack.size()-1;
		
		return this.stack.get(lastElement);
	}

	public int pop() {
		if(this.stack.isEmpty())
			throw new ArrayIndexOutOfBoundsException();
		
		int lastElement = this.stack.size()-1;
		int topValue = this.stack.get(lastElement);
		
		this.stack.remove(lastElement);
		
		return topValue;
	}

}

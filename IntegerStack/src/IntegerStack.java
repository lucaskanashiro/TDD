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
		
		return this.stack.get(this.getIndexOfLastElement());
	}

	public int pop() {
		int topValue = this.top();
		
		this.stack.remove(this.getIndexOfLastElement());
		
		return topValue;
	}
	
	private int getIndexOfLastElement(){
		return this.stack.size()-1;
	}

	public int count() {
		return this.stack.size();
	}

}

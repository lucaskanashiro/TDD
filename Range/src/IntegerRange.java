
public class IntegerRange {

	private int minimum, maximum;
	
	public IntegerRange(int minimum, int maximum){
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public boolean inRange(int number) {
		if(number >= this.minimum && number <= this.maximum)
			return true;
		else
			return false;
	}
}

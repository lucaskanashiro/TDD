
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

	public boolean intersectionWith(IntegerRange range2) {
		for(int i = this.minimum; i<= this.maximum; i++){
			for(int j = range2.getMinimum(); j<= range2.getMaximum(); i++){
				if(i == j)
					return true;
			}
		}
		return false;
	}
	
	
}

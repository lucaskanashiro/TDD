
public class FloatRange {

	private float minimum, maximum;
	
	public FloatRange(float minimum , float maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public float getMinimum() {
		return minimum;
	}

	public float getMaximum() {
		return maximum;
	}

	public boolean inRange(float number) {
		if(number >= this.minimum && number <= this.maximum)
			return true;
		else
			return false;
	}

	public FloatRange intersectionWith(FloatRange range2) {
		FloatRange result;
		float min, max;
		
		for(float i=this.minimum; i<=this.maximum; i+=0.1){
			for(float j=range2.getMinimum(); j<=range2.getMaximum(); j+=0.1){
				
			}
		}
		
		return result;
	}

}

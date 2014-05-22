
public class Rectangle {

	private double xmin, ymin, xmax, ymax;
	
	public Rectangle(double xmin, double ymin, double xmax, double ymax) {
		if(xmax <= xmin || ymax <= ymin)
			throw new IllegalArgumentException();
		
		this.xmax = xmax;
		this.ymax = ymax;
		this.xmin = xmin;
		this.ymin = ymin;
	}

	public double calcArea() {
		return (this.xmax-this.xmin)*(this.ymax-this.ymin);
	}

	public double calcCircumference() {
		return (2*(this.xmax-this.xmin)) + (2*(this.ymax-this.ymin));
	}

	public boolean checkOverlapping(Rectangle rec2) {
		if (isEqualRectangle(rec2) || isOverlapping(rec2))
			return true;
		
		return false;
	}

	private boolean isOverlapping(Rectangle rec2) {
		return rec2.xmin <= this.xmax && rec2.xmax >= this.xmin;
	}

	private boolean isEqualRectangle(Rectangle rec2) {
		return rec2.xmax == this.xmax && rec2.xmin == this.xmin && rec2.ymax == this.ymax && rec2.ymin == this.ymin;
	}

}

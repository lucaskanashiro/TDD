
public class Line2d {
	
	private int x1, y1, x2, y2, x3, y3, x4, y4; 

	public Line2d(int _x1, int _y1, int _x2, int _y2, int _x3, int _y3, int _x4, int _y4) throws EqualPointsException {
		if(((_x1 == _x2) && (_y1 == _y2)) || ((_x3 == _x4) && (_y3 == _y4))){
			throw new EqualPointsException();
		}
		
		this.x1 = _x1;
		this.y1 = _y1;
		this.x2 = _x2;
		this.y2 = _y2;
		this.x3 = _x3;
		this.y3 = _y3;
		this.x4 = _x4;
		this.y4 = _y4;
	}

	public boolean equalSegments() {
		if(x1 == x3 && y1 == y3 && x2 == x4 && y2 == y4)
			return true;
		else
			return false;
	}

}

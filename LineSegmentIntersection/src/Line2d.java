
public class Line2d {

	public Line2d(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) throws EqualPointsException {
		if(((x1 == x2) && (y1 == y2)) || ((x3 == x4) && (y3 == y4))){
			throw new EqualPointsException();
		}
	}

}

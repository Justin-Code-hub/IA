package environment;

import math.Point2i;

public class Wall extends SerializableObject {

	private static final long serialVersionUID = 6263862762372690657L;

	Wall(int x, int y) {
		super(x, y);
		setObstructView(true);
	}
	
	Wall(Point2i position) {
		super(position);
		setObstructView(true);
	}
}

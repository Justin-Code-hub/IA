package environment;

import java.util.UUID;

import dataStructure.Direction;
import math.Point2i;

public class Human extends Body{

	private static final long serialVersionUID = 7794826569733737977L;

	Human(int x, int y, UUID Id) {
		super(x, y, Id);
		super.setObstructView(true);
	}
	
	Human(Point2i position, UUID Id){
		super(position, Id);
		setObstructView(true);
	}
	
	Human(Point2i position, UUID Id, Point2i direction){
		super(position, Id, direction);
		setObstructView(true);
	}
}

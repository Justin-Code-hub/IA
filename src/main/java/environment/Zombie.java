package environment;

import java.util.UUID;

import dataStructure.Direction;
import math.Point2i;

public class Zombie extends Body{

	private static final long serialVersionUID = 4344093388562759697L;

	Zombie(int x, int y, UUID Id) {
		super(x, y, Id);
		setObstructView(true);
	}
	
	Zombie(Point2i position, UUID Id) {
		super(position, Id);
		setObstructView(true);
	}	
	
	Zombie(Point2i position, UUID Id, Point2i direction) {
		super(position, Id, direction);
		setObstructView(true);
	}	
}

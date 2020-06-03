package environment;

import java.util.UUID;

import math.Point2i;

public class Human extends Body{

	private static final long serialVersionUID = 7794826569733737977L;

	Human(int x, int y, UUID Id) {
		super(x, y, Id);
		// TODO Auto-generated constructor stub
	}
	
	Human(Point2i position, UUID Id){
		super(position, Id);
	}

	@Override
	public boolean isOccluder() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPickable() {
		// TODO Auto-generated method stub
		return false;
	}

}

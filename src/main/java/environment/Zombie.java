package environment;

import java.util.UUID;

import math.Point2i;

public class Zombie extends Body{

	private static final long serialVersionUID = 4344093388562759697L;

	Zombie(int x, int y, UUID Id) {
		super(x, y, Id);
	}
	
	Zombie(Point2i position, UUID Id) {
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

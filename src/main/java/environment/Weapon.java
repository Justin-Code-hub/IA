package environment;

import java.util.UUID;

import math.Point2i;

public class Weapon extends SerializableObject {

	private static final long serialVersionUID = -5902975306447652648L;
	private final UUID Id;

	Weapon(Point2i position, UUID Id) {
		super(position);
		this.Id = Id;
		this.setObstructView(false);
	}
	
	Weapon(int x, int y, UUID Id) {
		super(x, y);
		this.Id = Id;
		this.setObstructView(false);
	}
	
	public UUID getId() {
		return this.Id;
	}
}

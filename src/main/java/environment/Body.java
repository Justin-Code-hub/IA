package environment;
import java.util.Random;
import java.util.UUID;

import dataStructure.Direction;
import math.Point2i;

public abstract class Body extends SerializableObject{
	
	private static final long serialVersionUID = 8152017784163989595L;
	private final UUID Id;
	private final Point2i direction;
	
	// var random = new Random
	// var direction = directions.get(random.nextInt(directions.size))
	Body(int x, int y, UUID Id){
		super(x, y);
		this.Id = Id;
		this.direction = Direction.DIRECTIONS[new Random().nextInt(Direction.DIRECTIONS.length)];
	}
	
	Body(Point2i position, UUID Id){
		super(position);
		this.Id = Id;
		this.direction = Direction.DIRECTIONS[new Random().nextInt(Direction.DIRECTIONS.length)];
	}
	
	Body(Point2i position, UUID Id, Point2i direction){
		super(position);
		this.Id = Id;
		this.direction =  direction;
	}

	public UUID getId() {
		return this.Id;
	}

	public Point2i getDirection() {
		return this.direction;
	}
}

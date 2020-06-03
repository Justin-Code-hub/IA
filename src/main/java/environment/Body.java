package environment;
import java.util.UUID;

import math.Point2i;

public abstract class Body extends SerializableObject{
	
	private static final long serialVersionUID = 8152017784163989595L;
	private final UUID Id;
	
	Body(int x, int y, UUID Id){
		super(x, y);
		this.Id = Id;
	}
	
	Body(Point2i position, UUID Id){
		super(position);
		this.Id = Id;
	}

	public UUID getId() {
		return this.Id;
	}
	
	
}

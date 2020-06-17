/* 
 * $Id$
 * 
 * Copyright (c) 2015 Stephane GALLAND.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * This program is free software; you can redistribute it and/or modify
 */
package environment;

import java.io.Serializable;
import java.util.Objects;

import math.Point2i;

/**
 * Object in the PacMan environment.
 * 
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
public abstract class SerializableObject implements Serializable {

	private static final long serialVersionUID = -2687900803025474730L;

	private final Point2i position;
	private Boolean obstructView = true;
	
	
	SerializableObject(int x, int y) {
		this.position = new Point2i(x, y);
	}

	SerializableObject(Point2i position) {
		this(position.getX(), position.getY());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass())) {
			SerializableObject o = (SerializableObject) obj;
			return o.getPosition().equals(getPosition());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(position);
	}
	
	/** Replies the position of the object.
	 * 
	 * @return the position.
	 */
	
	public Point2i getPosition() {
		return this.position.clone();
	}
	
	/** Change the position of the object.
	 */
	void setPosition(int x, int y) {
		this.position.set(x, y);
	}

	public boolean getObstructView() {
		return this.obstructView;
	}

	public void setObstructView(boolean b) {
		this.obstructView = b;
	}
}

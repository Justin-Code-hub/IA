package dataStructure;

import math.Point2i;

public class Direction {
	public final static Point2i UP = new Point2i(0, -1);
	public final static Point2i DOWN = new Point2i(0, 1);
	public final static Point2i RIGHT = new Point2i(1, 0);
	public final static Point2i LEFT = new Point2i(-1, 0);
	
	public final static Point2i[] DIRECTIONS = {UP, DOWN, RIGHT, LEFT};
}

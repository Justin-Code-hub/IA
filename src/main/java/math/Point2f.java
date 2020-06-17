package math;

import math.Point2f;
import math.Point2i;

public class Point2f {
	
	protected float x;
	protected float y;
	
	public Point2f() {
		this.x = this.y = 0;
	}
	
	public Point2f(Point2f p) {
		this.x = p.getX();
		this.y = p.getY();
	}
	
	public Point2f(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2f(Point2i p) {
		this.x = p.getX();
		this.y = p.getY();
	}

	public float getY() {
		return this.y;
	}

	public float getX() {
		return this.x;
	}
	
	public void addX(float x) {
		this.x += x;
	}
	
	public void addX(int x) {
		this.x += x;
	}
	
	public void addY(float y) {
		this.y += y;
	}
	
	public void subX(float x) {
		this.x -= x;
	}
	
	public void subY(float y) {
		this.y -= y;
	}

	public Point2f operator_minus(Point2f p1, Point2f p2) {
		Point2f r = new Point2f(p1);
		r.sub(p2);
		return r;
	}
	
	public boolean equals(Point2f p) {
		return this.x == p.getX() && this.y == p.getY();
	}
	
	public boolean equals(Point2i p) {
		return Math.round(this.x) == p.getX() && Math.round(this.y) == p.getY();
	}
	
	public void add(Point2f p) {		
		this.x += p.getX();
		this.y += p.getY();
	}
	
	public void add(Point2i p) {		
		this.x += p.getX();
		this.y += p.getY();
	}
	
	public void sub(Point2f p) {		
		this.x -= p.getX();
		this.y -= p.getY();
	}
	
	public void sub(Point2i p) {		
		this.x -= p.getX();
		this.y -= p.getY();
	}
	
	public void add(float x, float y) {
		this.x += x;
		this.y += y;
	}
	
	public Point2f distance(Point2f p1, Point2f p2) {
		Point2f r = new Point2f(p1);
		r.sub(p2);
		return r;
	}
	
	public String toString() {
		return "(" + this.x + ";" + this.y + ")";
	}
	
	public Point2i toInt() {
		return new Point2i((int)this.x, (int)this.y);
	}
	
	public void divided(float n) {
		this.x /= n;
		this.y /= n;
	}

	public static Point2f distance(Point2i p1, Point2i p2) {
		Point2f r = new Point2f(p1);
		r.sub(p2);
		return r;
	}
}

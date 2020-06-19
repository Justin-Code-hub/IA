package dataStructure;

import math.Point2i;

public class PriorityQueuePair implements Comparable<PriorityQueuePair>{
	private Integer distance;
	private Point2i position;
	
	
	public PriorityQueuePair(int distance, Point2i position) {
		this.distance = distance;
		this.position = position;
	}
	
	@Override
	public int compareTo(PriorityQueuePair other) {
		return this.getKey().compareTo(other.getKey());
	}

	public Integer getKey() {
		return this.distance;
	}
	
	public Point2i getValue() {
		return this.position;
	}
	
	public String toString() {
		return "Distance : " + this.distance + " / Position " + this.position;
	}
}

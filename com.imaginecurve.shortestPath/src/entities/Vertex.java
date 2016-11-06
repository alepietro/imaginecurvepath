package entities;

import java.util.Vector;

public class Vertex implements Comparable<Vertex> {
	private final String contributorName;
	private Vector<Edge> adjacencies;
	private double minDistance = Double.POSITIVE_INFINITY;
	private Vertex previous;

	public Vertex(String argName) {
		contributorName = argName;
	}

	public String toString() {
		return contributorName;
	}

	public int compareTo(Vertex other) {
		return Double.compare(minDistance, other.minDistance);
	}

	public Vector<Edge> getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(Vector<Edge> adjacencies) {
		this.adjacencies = adjacencies;
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public Vertex getPrevious() {
		return previous;
	}

	public void setPrevious(Vertex previous) {
		this.previous = previous;
	}

	public String getName() {
		return contributorName;
	}

	public void addEdge(Edge argEdge) {
		if (this.adjacencies == null) {
			this.adjacencies = new Vector<Edge>();
		}
		this.adjacencies.add(argEdge);
	}

}

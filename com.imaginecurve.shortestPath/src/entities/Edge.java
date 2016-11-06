package entities;

import parameters.ShortestPathParameters;

public class Edge {
	private final Vertex base;
	private final Vertex target;
	private final double weight;

	public Edge(Vertex argBase, Vertex argTarget) {
		base = argBase;
		target = argTarget;
		weight = ShortestPathParameters.VERTEX_WEIGHT;
	}

	public Vertex getBase() {
		return base;
	}

	public Vertex getTarget() {
		return target;
	}

	public double getWeight() {
		return weight;
	}

}

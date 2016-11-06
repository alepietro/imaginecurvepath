package dao;

import java.util.Vector;

import entities.Edge;
import entities.Vertex;

public class MyDataDao {

	private static Vector<Vertex> myVertex;
	private static boolean dataLoaded = false;

	/* Add a Vertex (model of a GitHub Project) */
	public static void addVertex(Vertex argVertex) {
		if (myVertex == null) {
			myVertex = new Vector<Vertex>();
		}
		myVertex.add(argVertex);
	}

	/* Add an Edge (model of a GitHub Contribution) */
	public static void addEdge(Edge argEdge) {
		if (myVertex == null) {
			Vertex temp = null;
			/* Loooking for the base Vertex */
			for (int i = 0; i < myVertex.size(); i++) {
				temp = myVertex.elementAt(i);
				if (temp.getName().equalsIgnoreCase(argEdge.getBase().getName())) {
					/* Base Vertex found */
					temp.addEdge(argEdge);
				}
			}

		}
	}

	/* Return the Vector of Vertex */
	public Vector<Vertex> getMyVertex() {
		return (myVertex);
	}

	/* Load the stub data */
	public static void loadStubData() {
		
        // mark all the vertices 
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex D = new Vertex("D");
        Vertex F = new Vertex("F");
        Vertex K = new Vertex("K");
        Vertex J = new Vertex("J");
        Vertex M = new Vertex("M");
        Vertex O = new Vertex("O");
        Vertex P = new Vertex("P");
        Vertex R = new Vertex("R");
        Vertex Z = new Vertex("Z");

        // set the edges
        Edge temp = new Edge(A, M);
        Vector<Edge> ad = new Vector<Edge>();
        ad.addElement(temp);
        A.setAdjacencies(ad);
        
        temp = new Edge(B,D);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        B.setAdjacencies(ad);
        
        temp = new Edge(D,B);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        D.setAdjacencies(ad);
        
        temp = new Edge(F,K);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        F.setAdjacencies(ad);
        
        temp = new Edge(K,O);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        K.setAdjacencies(ad);
        
        temp = new Edge(J,K);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        J.setAdjacencies(ad);
        
        temp = new Edge(M,R);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        M.setAdjacencies(ad);
        
        temp = new Edge(O,K);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        O.setAdjacencies(ad);

        temp = new Edge(P,Z);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        P.setAdjacencies(ad);

        temp = new Edge(R,P);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        R.setAdjacencies(ad);
        
        temp = new Edge(Z,P);
        ad = new Vector<Edge>();
        ad.addElement(temp);
        Z.setAdjacencies(ad);
        
        myVertex = new Vector<Vertex>();
        myVertex.add(A);
        myVertex.add(B);
        myVertex.add(D);
        myVertex.add(F);
        myVertex.add(K);
        myVertex.add(J);
        myVertex.add(M);
        myVertex.add(O);
        myVertex.add(P);
        myVertex.add(R);
        myVertex.add(Z);
        
		dataLoaded = true;
	}

	public static boolean isDataLoaded() {
		return dataLoaded;
	}

	public static void setDataLoaded(boolean dataLoaded) {
		MyDataDao.dataLoaded = dataLoaded;
	}

	public static Vertex getAVertex(String contributor) {
		Vertex res = null;

		for (int i = 0; i < myVertex.size(); i++) {
			if (myVertex.elementAt(i).getName().equalsIgnoreCase(contributor)) {
				res = myVertex.elementAt(i);
			}
		}

		return (res);
	}
}

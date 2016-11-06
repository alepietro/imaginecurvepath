package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import dao.MyDataDao;
import entities.Edge;
import entities.Vertex;

public class Controller {

	public static void computeShortestPath(String origin) {
		if (!MyDataDao.isDataLoaded()) {
			MyDataDao.loadStubData();
		}

		Vertex source = MyDataDao.getAVertex(origin);

		source.setMinDistance(0);
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
		vertexQueue.add(source);

		Edge e;
		while (!vertexQueue.isEmpty()) {
			Vertex u = vertexQueue.poll();

			// Visit each edge exiting u
			for (int j = 0; j < source.getAdjacencies().size(); j++) {
				e = source.getAdjacencies().elementAt(j);
				Vertex v = e.getTarget();
				double weight = e.getWeight();
				double distanceThroughU = u.getMinDistance() + weight;
				if (distanceThroughU < v.getMinDistance()) {
					vertexQueue.remove(v);

					v.setMinDistance(distanceThroughU);
					v.setPrevious(u);
					vertexQueue.add(v);
				}
			}
		}

	}
	
    public static List<Vertex> getShortestPathTo(String destination)
    {
    	Vertex target = MyDataDao.getAVertex(destination);
    	
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.getPrevious())
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }
    
    public static String getShortestWeightTo(String destination)
    {
    	Vertex target = MyDataDao.getAVertex(destination);
    	
        return ""+target.getMinDistance();
    }

}

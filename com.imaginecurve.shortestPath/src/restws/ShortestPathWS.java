package restws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import control.Controller;
import entities.Contributors;

@Path("/shpath")
public class ShortestPathWS {

	@POST
	@Path("/getPath")
	@Consumes(MediaType.APPLICATION_XML)
	public String getShortestPath(Contributors users) {
		String res = "";
		Controller.computeShortestPath(users.getFIRSTCONTRIBUTOR());
		res = "" + Controller.getShortestPathTo(users.getSECONDCONTRIBUTOR());
		return(res);
	}
	
	@POST
	@Path("/getWeight")
	@Consumes(MediaType.APPLICATION_XML)
	public String getShortestWeight(Contributors users) {
		String res = "";
		Controller.computeShortestPath(users.getFIRSTCONTRIBUTOR());
		res = Controller.getShortestWeightTo(users.getSECONDCONTRIBUTOR());
		return(res);
	}

}

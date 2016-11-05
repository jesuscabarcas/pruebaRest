package example.microservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/placasRobadas")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class Library {
	 @GET
	    @Path("/placas")
	    public List<Placas> getBooks() {
		 List<Placas> listaPlacas = new ArrayList<Placas>();
		 Placas	placas=null;
	    for(int x=0;x<50;x++){
	    	placas = new Placas();
			 placas.setNumero("vba"+x);
			 listaPlacas.add(placas);
	    }
		
		 
		 return listaPlacas;
	    }
	 
	    @GET
	    @Path("/placas/{placa}")
	    public Placas getVerificarPlaca(@PathParam("placa") String id) {
	    	Map<String, Placas> map = new HashMap<String, Placas>();
			 Placas	placas=null;
		    for(int x=0;x<50;x++){
		    	placas = new Placas();
				 placas.setNumero("vba"+x);
				 map.put(placas.getNumero(),placas);
		    }
		    Placas pl=map.get(id);
	    	
	    	return pl;
	    
	    }
	 
	   
	    
}

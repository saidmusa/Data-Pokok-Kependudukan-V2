package id.ac.its.pbkk.kependudukan.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import id.ac.its.pbkk.kependudukan.domain.*;
import id.ac.its.pbkk.kependudukan.service.AgamaService;
import com.mkyong.Track;
import org.joda.time.DateTime; 

@Path("/agama")
public class AgamaWs {
	AgamaService agamaService;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Agama getAgamaById() {

		Agama agama = new Agama();
		agama.setId(1);
		agama.setNama("islam");
		return agama;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}
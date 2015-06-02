package id.ac.its.pbkk.kependudukan.webservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import id.ac.its.pbkk.kependudukan.data.*;
import id.ac.its.pbkk.kependudukan.domain.*;

import com.mkyong.Track;

import org.joda.time.DateTime; 

@Path("/levelWilayah")
public class LevelWilayahWs {
	LevelWilayahDao levelWilayahDao;
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public LevelWilayah getLevelWilayahById(@PathParam("id") int id) {
		LevelWilayah levelWilayah = levelWilayahDao.findById(id);
		return levelWilayah;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LevelWilayah> getList() {
		List<LevelWilayah> levelWilayahs = levelWilayahDao.list();
		return levelWilayahs;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateLevelWilayah(LevelWilayah levelWilayah) {
		levelWilayahDao.update(levelWilayah);
		String result = "levelWilayah saved";
		return Response.status(201).entity(result).build();
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createLevelWilayah(LevelWilayah levelWilayah) {
		levelWilayahDao.save(levelWilayah);
		String result = "levelWilayah saved";
		return Response.status(201).entity(result).build();	
	}
}
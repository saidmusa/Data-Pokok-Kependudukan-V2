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

@Path("/wargaNegara")
public class WargaNegaraWs {
	WargaNegaraDao wargaNegaraDao;
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public WargaNegara getWargaNegaraById(@PathParam("id") int id) {
		WargaNegara wargaNegara = wargaNegaraDao.findById(id);
		return wargaNegara;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<WargaNegara> getList() {
		List<WargaNegara> wargaNegaras = wargaNegaraDao.list();
		return wargaNegaras;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateWargaNegara(WargaNegara wargaNegara) {
		wargaNegaraDao.update(wargaNegara);
		String result = "wargaNegara saved";
		return Response.status(201).entity(result).build();
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createWargaNegara(WargaNegara wargaNegara) {
		wargaNegaraDao.save(wargaNegara);
		String result = "wargaNegara saved";
		return Response.status(201).entity(result).build();
	}
}
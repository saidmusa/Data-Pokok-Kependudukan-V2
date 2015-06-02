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

import org.joda.time.DateTime; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/pekerjaan")
public class PekerjaanWs {
	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("applicationContext.xml");
	PekerjaanDao pekerjaanDao = (PekerjaanDao) context.getBean("pekerjaanDao");
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pekerjaan getPekerjaanById(@PathParam("id") int id) {
		Pekerjaan pekerjaan = pekerjaanDao.findById(id);
		return pekerjaan;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pekerjaan> getList() {
		List<Pekerjaan> pekerjaans = pekerjaanDao.list();
		return pekerjaans;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updatePekerjaan(Pekerjaan pekerjaan) {
		pekerjaanDao.update(pekerjaan);
		String result = "pekerjaan saved";
		return Response.status(201).entity(result).build();
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createPekerjaan(Pekerjaan pekerjaan) {
		pekerjaanDao.save(pekerjaan);
		String result = "pekerjaan saved";
		return Response.status(201).entity(result).build();	
	}
}
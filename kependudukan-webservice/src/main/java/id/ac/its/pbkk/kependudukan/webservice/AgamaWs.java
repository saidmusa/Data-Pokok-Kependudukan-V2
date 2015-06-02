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

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.joda.time.DateTime; 

@Path("/agama")

public class AgamaWs {
	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("applicationContext.xml");
	AgamaDao agamaDao = (AgamaDao) context.getBean("agamaDao");
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Agama getAgamaById(@PathParam("id") int id) {
		Agama agama = agamaDao.findById(id);
		return agama;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Agama> getList() {
		List<Agama> agamas = agamaDao.list();
		return agamas;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateAgama(Agama agama) {
		agamaDao.update(agama);
		String result = "agama saved";
		return Response.status(201).entity(result).build();
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createAgama(Agama agama) {
		agamaDao.save(agama);
		String result = "agama saved";
		return Response.status(201).entity(result).build();	
	}
}
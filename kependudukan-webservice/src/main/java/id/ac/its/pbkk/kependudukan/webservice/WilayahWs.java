package id.ac.its.pbkk.kependudukan.webservice;

import java.util.List;
import java.util.UUID;

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
import org.joda.time.DateTime; 

@Path("/wilayah")
public class WilayahWs {
	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("applicationContext.xml");
	WilayahDao wilayahDao = (WilayahDao) context.getBean("wilayahDao");
	
	@GET
	@Path("/getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Wilayah getById(@PathParam("id") int id) {
		Wilayah wilayah = wilayahDao.findById(id);
		return wilayah;
	}
	
	@GET
	@Path("/getChild/{induk}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Wilayah> getChild(@PathParam("induk") int id) {
		Wilayah induk = new Wilayah();
		induk.setId(id);
		List<Wilayah>  wilayahs = wilayahDao.findChild(induk);
		return wilayahs;
	}
	
	@GET
	@Path("/getInduk/{child}")
	@Produces(MediaType.APPLICATION_JSON)
	public Wilayah getInd(@PathParam("child") int idChild) {
		Wilayah child = new Wilayah();
		child.setId(idChild);
		Wilayah induk = child.getInduk();
		return induk;
	}
	/*
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Wilayah> getList() {
		List<Wilayah> wilayahs = wilayahDao.list();
		return wilayahs;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateAgama(Wilayah wilayah) {
		wilayahDao.update(wilayah);
		String result = "agama updated";
		return Response.status(201).entity(result).build();
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createAgama(Wilayah wilayah) {
		wilayahDao.save(wilayah);
		String result = "agama saved";
		return Response.status(201).entity(result).build();	
	}
	*/
}
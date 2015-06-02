package id.ac.its.pbkk.kependudukan.webservice;

import java.io.IOException;
import java.util.ArrayList;
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
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.joda.time.DateTime; 

import com.cedarsoftware.util.io.JsonWriter;

@Path("/wilayah")
public class WilayahWs {
	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("applicationContext.xml");
	WilayahDao wilayahDao = (WilayahDao) context.getBean("wilayahDao");
	
	private JSONObject toJson(Wilayah wilayah) throws JSONException {
		JSONObject obj = new JSONObject();
		obj.put("id", wilayah.getId());
		obj.put("nama", wilayah.getNama());	
		obj.put("exp", wilayah.getExp());
		obj.put("level", wilayah.getLevel().getId());
		if(wilayah.getInduk()!=null){
			obj.put("ind", wilayah.getInduk().getId());
			}
			else{
				obj.put("ind",wilayah.getInduk());
			}
		return obj;
	}
	
	@GET
	@Path("/getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject getById(@PathParam("id") int id) throws JSONException {
		Wilayah wilayah = wilayahDao.findById(id);
		return toJson(wilayah);
	}
	
	@GET
	@Path("/getChild/{induk}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONArray getChild(@PathParam("induk") int id) throws JSONException {
		Wilayah induk = new Wilayah();
		induk.setId(id);
		List<Wilayah>  wilayahs = wilayahDao.findChild(induk);
		JSONArray array = new JSONArray();
		for(int i=0;i<wilayahs.size();i++){
			array.put(toJson(wilayahs.get(i)));
		}
		return array;
	}
	
	@GET
	@Path("/getInduk/{child}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject getInd(@PathParam("child") int idChild) throws JSONException {
		Wilayah induk = wilayahDao.findById(idChild).getInduk();
		return toJson(induk);
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
	
}
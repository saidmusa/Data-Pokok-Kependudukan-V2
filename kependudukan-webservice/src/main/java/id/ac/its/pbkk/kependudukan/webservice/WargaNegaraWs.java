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

import com.mkyong.Track;

import org.joda.time.DateTime; 
import org.joda.time.LocalDateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/wargaNegara")
public class WargaNegaraWs {
	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("applicationContext.xml");
	WargaNegaraDao wargaNegaraDao = (WargaNegaraDao) context.getBean("wargaNegaraDao");
	
	@GET
	@Path("/getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public WargaNegara getWargaNegaraById(@PathParam("id") UUID id) {
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
		//parameter minimal : id, tmptlahir, no_kk, nama,tgl_lahir,jk, gol darah, shdk, pekerjaan, kwn, agama, wilayah
		String provinsi = "";
		String kota = "";
		String kecamatan = "";
		wargaNegara.setNik(provinsi+kota+kecamatan);
		wargaNegara.setIsHidup(true);
		wargaNegara.setIsKawin("0");
		wargaNegara.setCreated(new LocalDateTime().toDateTime());
		wargaNegara.setUpdated(new LocalDateTime().toDateTime());
		
		wargaNegaraDao.save(wargaNegara);
		String result = "wargaNegara saved";
		return Response.status(201).entity(result).build();
	}
}
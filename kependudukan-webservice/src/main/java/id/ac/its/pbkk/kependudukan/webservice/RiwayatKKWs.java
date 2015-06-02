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

@Path("/riwayatKK")
public class RiwayatKKWs {
	RiwayatKKDao riwayatKKDao;
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public RiwayatKK getRiwayatKKById(@PathParam("id") int id) {
		RiwayatKK riwayatKK = riwayatKKDao.findById(id);
		return riwayatKK;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<RiwayatKK> getList() {
		List<RiwayatKK> riwayatKKs = riwayatKKDao.list();
		return riwayatKKs;
	}
}
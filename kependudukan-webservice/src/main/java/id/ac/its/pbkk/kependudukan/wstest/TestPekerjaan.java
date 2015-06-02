package id.ac.its.pbkk.kependudukan.wstest;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.ac.its.pbkk.kependudukan.domain.*;
import id.ac.its.pbkk.kependudukan.service.*;
import id.ac.its.pbkk.kependudukan.data.*;

public class TestPekerjaan 
{
    public static void main( String[] args )
    {
    	System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		int idtes = 15;
		
		//test pekerjaan
		PekerjaanDao pekerjaanDao = (PekerjaanDao) context.getBean("pekerjaanDao");
		
		//create
		Pekerjaan lwcr = new Pekerjaan();
		lwcr.setNama("Petani");
		lwcr.setId(idtes);
		pekerjaanDao.save(lwcr);
		
		//read list
		List<Pekerjaan> pekerjaan = pekerjaanDao.list();
		for(int i =0 ;i<pekerjaan.size();i++){
			Pekerjaan pekerjaan1 = pekerjaan.get(i);
			System.out.println("Id : " + pekerjaan1.getId());	
			System.out.println("Nama : " + pekerjaan1.getNama());
		}
		
		
		//update
		Pekerjaan lwup = new Pekerjaan();
		lwup.setNama("Buruh Cuci");
		lwup.setId(idtes);
		pekerjaanDao.update(lwup);
		
		//read id
		Pekerjaan rd = new Pekerjaan();
		rd.setId(idtes);
		Pekerjaan rd1 = pekerjaanDao.findById(idtes);
		System.out.println("Id : " + rd1.getId());	
		System.out.println("Nama : " + rd1.getNama());
		
		
//		//delete
//		Pekerjaan lwdl = new Pekerjaan();
//		lwdl.setId(idtes);
//		pekerjaanDao.delete(lwdl);
		
		
		
		
		context.close();
    }
}
/*System.out.println("load context");
ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
Agama ag = new Agama("tes");
AgamaService agService = (AgamaService) context.getBean("agamaService");
agService.persist(ag);
/*System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());		
em.setAge(32);
emService.updateEmployee(em);
System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
emService.deleteEmployee(em);
context.close();*/

/*/test Agama
		AgamaDao agamaDAO = (AgamaDao) context.getBean("agamaDao");
		Agama ag = new Agama("tes lagi1");
		agamaDAO.save(ag);*/
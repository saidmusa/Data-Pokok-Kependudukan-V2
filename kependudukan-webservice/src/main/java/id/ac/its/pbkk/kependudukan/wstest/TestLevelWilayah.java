package id.ac.its.pbkk.kependudukan.wstest;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.ac.its.pbkk.kependudukan.domain.*;
import id.ac.its.pbkk.kependudukan.service.*;
import id.ac.its.pbkk.kependudukan.data.*;

public class TestLevelWilayah 
{
    public static void main( String[] args )
    {
    	System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		int idtes = 15;
		
		//test level wilayah
		LevelWilayahDao levelWilayahDao = (LevelWilayahDao) context.getBean("levelWilayahDao");
		
		//create
		LevelWilayah lwcr = new LevelWilayah();
		lwcr.setNama("Kota");
		lwcr.setId(idtes);
		levelWilayahDao.save(lwcr);
		
		//read list
		List<LevelWilayah> levelWilayah = levelWilayahDao.list();
		for(int i =0 ;i<levelWilayah.size();i++){
			LevelWilayah levelWilayah1 = levelWilayah.get(i);
			System.out.println("Id : " + levelWilayah1.getId());	
			System.out.println("Nama : " + levelWilayah1.getNama());
		}
		
		
		//update
		LevelWilayah lwup = new LevelWilayah();
		lwup.setNama("KotaKota");
		lwup.setId(idtes);
		levelWilayahDao.update(lwup);
		
		//read id
		LevelWilayah rd = new LevelWilayah();
		rd.setId(idtes);
		LevelWilayah rd1 = levelWilayahDao.findById(idtes);
		System.out.println("Id : " + rd1.getId());	
		System.out.println("Nama : " + rd1.getNama());
		
		
		//delete
		LevelWilayah lwdl = new LevelWilayah();
		lwdl.setId(idtes);
		levelWilayahDao.delete(lwdl);
		
		
		
		
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
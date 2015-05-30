package id.ac.its.pbkk.kependudukan.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.ac.its.pbkk.kependudukan.domain.*;
import id.ac.its.pbkk.kependudukan.service.*;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Agama ag = new Agama("yahudi");
		AgamaService agService = (AgamaService) context.getBean("agamaService");
		agService.persist(ag);
		/*System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());		
		em.setAge(32);
		emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
		emService.deleteEmployee(em);*/
		context.close();
    }
}

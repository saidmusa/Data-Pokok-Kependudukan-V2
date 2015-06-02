package id.ac.its.pbkk.kependudukan.service;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.Agama;
import id.ac.its.pbkk.kependudukan.data.AgamaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("agamaService")
public class AgamaServiceImpl implements AgamaService{
	
	@Autowired
	AgamaDao agamaDao;
	
	@Transactional
	public void persist(Agama agama) {
		//agamaDAO.persist(agama);
	}
	
	@Transactional
	public Agama findById(int id) {
		return agamaDao.findById(id);
	}

	@Transactional
	public void update(Agama agama) {
		agamaDao.update(agama);
	}
	
	@Transactional
	public void delete(Agama agama) {
		agamaDao.delete(agama);
	}
	@Transactional
	public void save(Agama agama) {
		agamaDao.save(agama);
		
	}
	@Transactional
	public List<Agama> list() {
		List<Agama> agamas = agamaDao.list();
		return agamas;
	}
	
}

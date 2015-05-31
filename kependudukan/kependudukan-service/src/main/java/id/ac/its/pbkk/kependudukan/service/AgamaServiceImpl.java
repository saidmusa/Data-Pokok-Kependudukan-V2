package id.ac.its.pbkk.kependudukan.service;

import id.ac.its.pbkk.kependudukan.domain.Agama;
import id.ac.its.pbkk.kependudukan.data.AgamaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("agamaService")
public class AgamaServiceImpl implements AgamaService{

	@Autowired
	AgamaDao agamaDAO;
	
	@Transactional
	public void persist(Agama agama) {
		//agamaDAO.persist(agama);
	}
	
	@Transactional
	public Agama findById(int id) {
		return agamaDAO.findById(id);
	}

	@Transactional
	public void update(Agama agama) {
		agamaDAO.update(agama);
	}
	
	@Transactional
	public void delete(Agama agama) {
		agamaDAO.delete(agama);
	}
	
}

package id.ac.its.pbkk.kependudukan.service;

import id.ac.its.pbkk.kependudukan.domain.AkteNikah;
import id.ac.its.pbkk.kependudukan.data.AkteCeraiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("agamaService")
public class AgamaServiceImpl implements AgamaService{

	@Autowired
	AkteCeraiDao agamaDAO;
	
	@Transactional
	public void persist(AkteNikah agama) {
		//agamaDAO.persist(agama);
	}
	
	@Transactional
	public AkteNikah findById(int id) {
		return agamaDAO.findById(id);
	}

	@Transactional
	public void update(AkteNikah agama) {
		agamaDAO.update(agama);
	}
	
	@Transactional
	public void delete(AkteNikah agama) {
		agamaDAO.delete(agama);
	}
	
}

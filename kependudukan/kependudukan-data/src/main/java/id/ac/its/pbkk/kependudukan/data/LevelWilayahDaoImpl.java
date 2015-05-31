package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.LevelWilayah;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Repository("levelWilayahDao")
public class LevelWilayahDaoImpl implements LevelWilayahDao{
	
	public LevelWilayahDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementation
	
	public LevelWilayah findById(int id) {
		return (LevelWilayah) sessionFactory.getCurrentSession().get(LevelWilayah.class, id);
	}

	public void save(LevelWilayah levelWilayah) {
		sessionFactory.getCurrentSession().save(levelWilayah);
	}

	public void update(LevelWilayah levelWilayah) {
		sessionFactory.getCurrentSession().update(levelWilayah);
		
	}

	public void delete(LevelWilayah levelWilayah) {
		sessionFactory.getCurrentSession().delete(levelWilayah);
		
	}

	public List<LevelWilayah> list() {
		List<LevelWilayah> listLevelWilayah = (List<LevelWilayah>) sessionFactory.getCurrentSession().createQuery("from LevelWilayah").list();
		return listLevelWilayah;
	}
	
	
	
}

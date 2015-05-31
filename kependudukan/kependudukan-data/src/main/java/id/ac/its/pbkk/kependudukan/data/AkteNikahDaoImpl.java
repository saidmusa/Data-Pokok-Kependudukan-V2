package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.AkteNikah;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Repository("akteNikahDao")
public class AkteNikahDaoImpl implements AkteNikahDao{
	
	public AkteNikahDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementation
	
	public AkteNikah findById(int id) {
		return (AkteNikah) sessionFactory.getCurrentSession().get(AkteNikah.class, id);
	}

	public void save(AkteNikah akteNikah) {
		sessionFactory.getCurrentSession().save(akteNikah);
	}

	public void update(AkteNikah akteNikah) {
		sessionFactory.getCurrentSession().update(akteNikah);
		
	}

	public void delete(AkteNikah akteNikah) {
		sessionFactory.getCurrentSession().delete(akteNikah);
		
	}

	public List<AkteNikah> list() {
		List<AkteNikah> listAkteNikah = (List<AkteNikah>) sessionFactory.getCurrentSession().createQuery("from AkteNikah").list();
		return listAkteNikah;
	}
	
	
	
}

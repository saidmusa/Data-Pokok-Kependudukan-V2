package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.AkteCerai;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Repository("akteCeraiDao")
public class AkteCeraiDaoImpl implements AkteCeraiDao{
	
	public AkteCeraiDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementation
	
	public AkteCerai findById(int id) {
		return (AkteCerai) sessionFactory.getCurrentSession().get(AkteCerai.class, id);
	}

	public void save(AkteCerai akteCerai) {
		sessionFactory.getCurrentSession().save(akteCerai);
	}

	public void update(AkteCerai akteCerai) {
		sessionFactory.getCurrentSession().update(akteCerai);
		
	}

	public void delete(AkteCerai akteCerai) {
		sessionFactory.getCurrentSession().delete(akteCerai);
		
	}

	public List<AkteCerai> list() {
		List<AkteCerai> listAkteCerai = (List<AkteCerai>) sessionFactory.getCurrentSession().createQuery("from AkteCerai").list();
		return listAkteCerai;
	}
	
	
	
}

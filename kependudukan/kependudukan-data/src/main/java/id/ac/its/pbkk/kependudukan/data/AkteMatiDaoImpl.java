package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.AkteMati;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("akteMatiDao")
public class AkteMatiDaoImpl implements AkteMatiDao{
	
	public AkteMatiDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public AkteMati findById(int id) {
		return (AkteMati) sessionFactory.getCurrentSession().get(AkteMati.class, id);
	}
	
	public List<AkteMati> list() {
		List<AkteMati> listAkteMati = (List<AkteMati>) sessionFactory.getCurrentSession().createQuery("from AkteMati").list();
		return listAkteMati;
	}
	public void save(AkteMati akteMati) {
		sessionFactory.getCurrentSession().save(akteMati);
	}
	public void update(AkteMati akteMati) {
		sessionFactory.getCurrentSession().update(akteMati);
	}

	public void delete(AkteMati akteMati) {
		sessionFactory.getCurrentSession().delete(akteMati);
	}

}

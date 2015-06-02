package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.Wilayah;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("wilayahDao")
public class WilayahDaoImpl implements WilayahDao{
	
	public WilayahDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public Wilayah findById(int id) {
		return (Wilayah) sessionFactory.getCurrentSession().get(Wilayah.class, id);
	}
	
	public List<Wilayah> list() {
		List<Wilayah> listWilayah = (List<Wilayah>) sessionFactory.getCurrentSession().createQuery("from Wilayah").list();
		return listWilayah;
	}
	public void save(Wilayah wilayah) {
		sessionFactory.getCurrentSession().save(wilayah);
	}
	public void update(Wilayah wilayah) {
		sessionFactory.getCurrentSession().update(wilayah);
	}

	public void delete(Wilayah wilayah) {
		sessionFactory.getCurrentSession().delete(wilayah);
	}

	public List<Wilayah> findChild(Wilayah induk) {
		List<Wilayah> listWilayah = (List<Wilayah>) sessionFactory.getCurrentSession().createQuery("from Wilayah where induk = " + induk.getId()).list();
		return listWilayah;
	}

	

}

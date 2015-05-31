package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.Pekerjaan;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("pekerjaanDao")
public class PekerjaanDaoImpl implements PekerjaanDao{
	
	public PekerjaanDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public Pekerjaan findById(int id) {
		return (Pekerjaan) sessionFactory.getCurrentSession().get(Pekerjaan.class, id);
	}
	
	public List<Pekerjaan> list() {
		List<Pekerjaan> listPekerjaan = (List<Pekerjaan>) sessionFactory.getCurrentSession().createQuery("from Pekerjaan").list();
		return listPekerjaan;
	}
	public void save(Pekerjaan pekerjaan) {
		sessionFactory.getCurrentSession().save(pekerjaan);
	}
	public void update(Pekerjaan pekerjaan) {
		sessionFactory.getCurrentSession().update(pekerjaan);
	}

	public void delete(Pekerjaan pekerjaan) {
		sessionFactory.getCurrentSession().delete(pekerjaan);
	}

}

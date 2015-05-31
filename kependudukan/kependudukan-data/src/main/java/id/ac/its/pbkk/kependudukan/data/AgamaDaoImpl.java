package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.Agama;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("agamaDao")
public class AgamaDaoImpl implements AgamaDao{
	
	public AgamaDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public Agama findById(int id) {
		return (Agama) sessionFactory.getCurrentSession().get(Agama.class, id);
	}
	
	public List<Agama> list() {
		List<Agama> listAgama = (List<Agama>) sessionFactory.getCurrentSession().createQuery("from Agama").list();
		return listAgama;
	}
	public void save(Agama agama) {
		sessionFactory.getCurrentSession().save(agama);
	}
	public void update(Agama agama) {
		sessionFactory.getCurrentSession().update(agama);
	}

	public void delete(Agama agama) {
		sessionFactory.getCurrentSession().delete(agama);
	}

}

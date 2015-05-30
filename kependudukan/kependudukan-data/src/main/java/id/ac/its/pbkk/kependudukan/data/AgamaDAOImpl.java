package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.Agama;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("agamaDAO")
public class AgamaDAOImpl implements AgamaDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void persist(Agama agama) {
		sessionFactory.getCurrentSession().persist(agama);
	}

	public Agama findById(int id) {
		return (Agama) sessionFactory.getCurrentSession().get(Agama.class, id);
	}
	
	public List<Agama> list() {
		List<Agama> listAgama = (List<Agama>) sessionFactory.getCurrentSession().createQuery("from Agama").list();
		return listAgama;
	}
	
	public void update(Agama agama) {
		sessionFactory.getCurrentSession().update(agama);
	}

	public void delete(Agama agama) {
		sessionFactory.getCurrentSession().delete(agama);
	}

}

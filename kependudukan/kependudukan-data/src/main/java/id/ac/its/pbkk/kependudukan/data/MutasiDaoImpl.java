package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.Mutasi;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("mutasiDao")
public class MutasiDaoImpl implements MutasiDao{
	
	public MutasiDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public Mutasi findById(int id) {
		return (Mutasi) sessionFactory.getCurrentSession().get(Mutasi.class, id);
	}
	
	public List<Mutasi> list() {
		List<Mutasi> listMutasi = (List<Mutasi>) sessionFactory.getCurrentSession().createQuery("from Mutasi").list();
		return listMutasi;
	}
	public void save(Mutasi mutasi) {
		sessionFactory.getCurrentSession().save(mutasi);
	}
	public void update(Mutasi mutasi) {
		sessionFactory.getCurrentSession().update(mutasi);
	}

	public void delete(Mutasi mutasi) {
		sessionFactory.getCurrentSession().delete(mutasi);
	}

}

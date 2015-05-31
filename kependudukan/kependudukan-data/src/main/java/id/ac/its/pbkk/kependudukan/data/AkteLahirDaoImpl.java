package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.AkteLahir;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("akteLahirDao")
public class AkteLahirDaoImpl implements AkteLahirDao{
	
	public AkteLahirDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public AkteLahir findById(int id) {
		return (AkteLahir) sessionFactory.getCurrentSession().get(AkteLahir.class, id);
	}
	
	public List<AkteLahir> list() {
		List<AkteLahir> listAkteLahir = (List<AkteLahir>) sessionFactory.getCurrentSession().createQuery("from AkteLahir").list();
		return listAkteLahir;
	}
	public void save(AkteLahir akteLahir) {
		sessionFactory.getCurrentSession().save(akteLahir);
	}
	public void update(AkteLahir akteLahir) {
		sessionFactory.getCurrentSession().update(akteLahir);
	}

	public void delete(AkteLahir akteLahir) {
		sessionFactory.getCurrentSession().delete(akteLahir);
	}

}

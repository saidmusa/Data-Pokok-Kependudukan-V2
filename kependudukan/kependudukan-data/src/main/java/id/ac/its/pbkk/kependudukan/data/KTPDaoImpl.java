package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.KTP;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("ktpDao")
public class KTPDaoImpl implements KTPDao{
	
	public KTPDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public KTP findById(int id) {
		return (KTP) sessionFactory.getCurrentSession().get(KTP.class, id);
	}
	
	public List<KTP> list() {
		List<KTP> listKTP = (List<KTP>) sessionFactory.getCurrentSession().createQuery("from KTP").list();
		return listKTP;
	}
	public void save(KTP ktp) {
		sessionFactory.getCurrentSession().save(ktp);
	}
	public void update(KTP ktp) {
		sessionFactory.getCurrentSession().update(ktp);
	}

	public void delete(KTP ktp) {
		sessionFactory.getCurrentSession().delete(ktp);
	}

}

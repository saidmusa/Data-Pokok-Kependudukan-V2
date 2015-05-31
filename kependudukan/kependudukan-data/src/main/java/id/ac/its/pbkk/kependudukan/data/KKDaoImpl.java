package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.KK;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("kkDao")
public class KKDaoImpl implements KKDao{
	
	public KKDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public KK findById(int id) {
		return (KK) sessionFactory.getCurrentSession().get(KK.class, id);
	}
	
	public List<KK> list() {
		List<KK> listKK = (List<KK>) sessionFactory.getCurrentSession().createQuery("from KK").list();
		return listKK;
	}
	public void save(KK kk) {
		sessionFactory.getCurrentSession().save(kk);
	}
	public void update(KK kk) {
		sessionFactory.getCurrentSession().update(kk);
	}

	public void delete(KK kk) {
		sessionFactory.getCurrentSession().delete(kk);
	}

}

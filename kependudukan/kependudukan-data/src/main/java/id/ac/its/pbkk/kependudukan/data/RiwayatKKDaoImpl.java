package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.RiwayatKK;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("riwayatKKDao")
public class RiwayatKKDaoImpl implements RiwayatKKDao{
	
	public RiwayatKKDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public RiwayatKK findById(int id) {
		return (RiwayatKK) sessionFactory.getCurrentSession().get(RiwayatKK.class, id);
	}
	
	public List<RiwayatKK> list() {
		List<RiwayatKK> listRiwayatKK = (List<RiwayatKK>) sessionFactory.getCurrentSession().createQuery("from RiwayatKK").list();
		return listRiwayatKK;
	}
	public void save(RiwayatKK riwayatkk) {
		sessionFactory.getCurrentSession().save(riwayatkk);
	}
	public void update(RiwayatKK riwayatkk) {
		sessionFactory.getCurrentSession().update(riwayatkk);
	}

	public void delete(RiwayatKK riwayatkk) {
		sessionFactory.getCurrentSession().delete(riwayatkk);
	}


}

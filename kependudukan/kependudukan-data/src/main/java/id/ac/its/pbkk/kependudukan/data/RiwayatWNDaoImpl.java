package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.RiwayatWN;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("riwayatWNDao")
public class RiwayatWNDaoImpl implements RiwayatWNDao{
	
	public RiwayatWNDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public RiwayatWN findById(int id) {
		return (RiwayatWN) sessionFactory.getCurrentSession().get(RiwayatWN.class, id);
	}
	
	public List<RiwayatWN> list() {
		List<RiwayatWN> listRiwayatWN = (List<RiwayatWN>) sessionFactory.getCurrentSession().createQuery("from RiwayatWN").list();
		return listRiwayatWN;
	}
	public void save(RiwayatWN riwayatwn) {
		sessionFactory.getCurrentSession().save(riwayatwn);
	}
	public void update(RiwayatWN riwayatwn) {
		sessionFactory.getCurrentSession().update(riwayatwn);
	}

	public void delete(RiwayatWN riwayatwn) {
		sessionFactory.getCurrentSession().delete(riwayatwn);
	}

}

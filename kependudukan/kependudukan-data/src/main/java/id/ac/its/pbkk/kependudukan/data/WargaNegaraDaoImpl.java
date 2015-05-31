package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import id.ac.its.pbkk.kependudukan.domain.WargaNegara;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Transactional
@Repository("wargaNegaraDao")
public class WargaNegaraDaoImpl implements WargaNegaraDao{
	
	public WargaNegaraDaoImpl(){}
	
	private SessionFactory sessionFactory;
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//implementasi
	public WargaNegara findById(int id) {
		return (WargaNegara) sessionFactory.getCurrentSession().get(WargaNegara.class, id);
	}
	
	public List<WargaNegara> list() {
		List<WargaNegara> listWargaNegara = (List<WargaNegara>) sessionFactory.getCurrentSession().createQuery("from WargaNegara").list();
		return listWargaNegara;
	}
	public void save(WargaNegara wargaNegara) {
		sessionFactory.getCurrentSession().save(wargaNegara);
	}
	public void update(WargaNegara wargaNegara) {
		sessionFactory.getCurrentSession().update(wargaNegara);
	}

	public void delete(WargaNegara wargaNegara) {
		sessionFactory.getCurrentSession().delete(wargaNegara);
	}

}

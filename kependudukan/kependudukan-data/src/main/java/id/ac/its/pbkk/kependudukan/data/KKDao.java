package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.KK;

public interface KKDao {
	  
	KK findById(int id);
	void save(KK kk);
	void update(KK kk);
	void delete(KK kk);	
	public List<KK> list();
}

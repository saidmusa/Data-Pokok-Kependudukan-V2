package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.KTP;

public interface KTPDao {
	  
	KTP findById(int id);
	void save(KTP agama);
	void update(KTP agama);
	void delete(KTP agama);	
	public List<KTP> list();
}

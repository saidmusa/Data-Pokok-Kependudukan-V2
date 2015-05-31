package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.AkteMati;

public interface AkteMatiDao {
	  
	AkteMati findById(int id);
	void save(AkteMati akteMati);
	void update(AkteMati akteMati);
	void delete(AkteMati akteMati);	
	public List<AkteMati> list();
}

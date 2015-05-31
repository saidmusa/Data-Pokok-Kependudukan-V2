package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.AkteLahir;

public interface AkteLahirDao {
	  
	AkteLahir findById(int id);
	void save(AkteLahir akteLahir);
	void update(AkteLahir akteLahir);
	void delete(AkteLahir akteLahir);	
	public List<AkteLahir> list();
}

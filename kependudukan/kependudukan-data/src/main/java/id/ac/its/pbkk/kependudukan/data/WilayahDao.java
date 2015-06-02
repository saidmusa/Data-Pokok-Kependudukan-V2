package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.Wilayah;

public interface WilayahDao {
	  
	Wilayah findById(int id);
	void save(Wilayah wilayah);
	void update(Wilayah wilayah);
	void delete(Wilayah wilayah);	
	public List<Wilayah> list();
	
	List<Wilayah> findChild(Wilayah induk);
}

package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.Mutasi;

public interface MutasiDao {
	  
	Mutasi findById(int id);
	void save(Mutasi id);
	void update(Mutasi id);
	void delete(Mutasi id);	
	public List<Mutasi> list();
}

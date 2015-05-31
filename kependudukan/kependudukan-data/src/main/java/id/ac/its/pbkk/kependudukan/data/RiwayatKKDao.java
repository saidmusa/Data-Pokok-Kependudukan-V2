package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.RiwayatKK;

public interface RiwayatKKDao {
	  
	RiwayatKK findById(int id);
	void save(RiwayatKK id);
	void update(RiwayatKK id);
	void delete(RiwayatKK id);	
	public List<RiwayatKK> list();
}

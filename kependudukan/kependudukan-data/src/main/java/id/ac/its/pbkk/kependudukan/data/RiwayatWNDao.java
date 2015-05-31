package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.RiwayatWN;

public interface RiwayatWNDao {
	  
	RiwayatWN findById(int id);
	void save(RiwayatWN id);
	void update(RiwayatWN id);
	void delete(RiwayatWN id);	
	public List<RiwayatWN> list();
}

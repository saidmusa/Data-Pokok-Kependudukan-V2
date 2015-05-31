package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.Pekerjaan;

public interface PekerjaanDao {
	  
	Pekerjaan findById(int id);
	void save(Pekerjaan pekerjaan);
	void update(Pekerjaan pekerjaan);
	void delete(Pekerjaan pekerjaan);	
	public List<Pekerjaan> list();
}

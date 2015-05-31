package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.Agama;

public interface AgamaDao {
	  
	Agama findById(int id);
	void save(Agama agama);
	void update(Agama agama);
	void delete(Agama agama);	
	public List<Agama> list();
}

package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.Agama;

public interface AgamaDAO {
	void persist(Agama agama);
	  
	Agama findById(int id);
	  
	void update(Agama agama);
	 
	void delete(Agama agama);
	
	public List<Agama> list();
}

package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.WargaNegara;

public interface WargaNegaraDao {
	  
	WargaNegara findById(int id);
	void save(WargaNegara wargaNegara);
	void update(WargaNegara wargaNegara);
	void delete(WargaNegara wargaNegara);	
	public List<WargaNegara> list();
}

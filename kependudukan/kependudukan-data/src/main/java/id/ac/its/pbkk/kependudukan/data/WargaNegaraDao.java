package id.ac.its.pbkk.kependudukan.data;

import java.util.List;
import java.util.UUID;
import id.ac.its.pbkk.kependudukan.domain.WargaNegara;

public interface WargaNegaraDao {
	  
	WargaNegara findById(UUID id);
	void save(WargaNegara wargaNegara);
	void update(WargaNegara wargaNegara);
	void delete(WargaNegara wargaNegara);	
	public List<WargaNegara> list();
}

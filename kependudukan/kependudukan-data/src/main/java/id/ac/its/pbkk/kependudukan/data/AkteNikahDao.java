package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.AkteNikah;

public interface AkteNikahDao {
	AkteNikah findById(int id);
	void save(AkteNikah akteNikah);
	void update(AkteNikah akteNikah);
	void delete(AkteNikah akteNikah);	
	public List<AkteNikah> list();
}

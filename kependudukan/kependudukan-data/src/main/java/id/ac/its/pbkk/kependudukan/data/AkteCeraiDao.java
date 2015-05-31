package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.AkteCerai;

public interface AkteCeraiDao {
	AkteCerai findById(int id);
	void save(AkteCerai akteCerai);
	void update(AkteCerai akteCerai);
	void delete(AkteCerai akteCerai);	
	public List<AkteCerai> list();
}

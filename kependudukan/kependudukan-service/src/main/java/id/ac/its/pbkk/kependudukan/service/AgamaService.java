package id.ac.its.pbkk.kependudukan.service;
import id.ac.its.pbkk.kependudukan.domain.Agama;

public interface AgamaService {
	void persist(Agama agama);

	Agama findById(int id);

	void update(Agama agama);

	void delete(Agama agama);
}
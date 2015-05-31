package id.ac.its.pbkk.kependudukan.service;
import id.ac.its.pbkk.kependudukan.domain.AkteNikah;

public interface AgamaService {
	void persist(AkteNikah agama);

	AkteNikah findById(int id);

	void update(AkteNikah agama);

	void delete(AkteNikah agama);
}

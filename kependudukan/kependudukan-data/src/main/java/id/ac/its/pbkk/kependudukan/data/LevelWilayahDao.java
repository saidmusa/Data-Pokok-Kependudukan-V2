package id.ac.its.pbkk.kependudukan.data;

import java.util.List;

import id.ac.its.pbkk.kependudukan.domain.LevelWilayah;;

public interface LevelWilayahDao {
	LevelWilayah findById(int id);
	void save(LevelWilayah levelWilayah);
	void update(LevelWilayah levelWilayah);
	void delete(LevelWilayah levelWilayah);
	public List<LevelWilayah> list();
}

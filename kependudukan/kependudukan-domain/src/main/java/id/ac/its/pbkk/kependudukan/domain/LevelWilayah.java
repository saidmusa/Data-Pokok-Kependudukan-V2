package id.ac.its.pbkk.kependudukan.domain;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_lvl_wilayah")
public class LevelWilayah{
	
	private int id;
	
	
	public String nama;
	
	
	public DateTime exp;
	
	//Constructor
	public LevelWilayah(){}
	public LevelWilayah(int id, String nama){
		this.setId(id);
		this.setNama(nama);
	}
	public LevelWilayah(String nama){
		this.setNama(nama);
	}
	
	//Setter getter
	@Id
	@Column(name = "ID", nullable = false, insertable = true, updatable = true)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "NAMA", nullable = false, length=50)
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	@Column(name = "EXPDATE", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	public DateTime getExp() {
		return exp;
	}
	public void setExp(DateTime exp) {
		this.exp = exp;
	}
	
}

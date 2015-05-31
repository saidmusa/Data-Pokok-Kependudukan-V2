package id.ac.its.pbkk.kependudukan.domain;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PEKERJAAN")
public class Pekerjaan {
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "EXP_DATE", nullable = true)
	private DateTime exp;
	
	
	@Column(name = "NAMA", nullable = false, length=20)
	private String nama;
	
	public Pekerjaan(){}
	
	public Pekerjaan(String nama){
		this.setNama(nama);
	}
	public Pekerjaan(int id, String nama, DateTime exp){
		this.setNama(nama);
		this.setExp(exp);
		this.setId(id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DateTime getExp() {
		return exp;
	}
	public void setExp(DateTime exp) {
		this.exp = exp;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
}
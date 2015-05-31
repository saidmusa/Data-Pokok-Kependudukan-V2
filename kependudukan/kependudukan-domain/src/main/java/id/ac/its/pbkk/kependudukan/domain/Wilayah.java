package id.ac.its.pbkk.kependudukan.domain;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "TBL_WILAYAH")
public class Wilayah{
	
	private int id;
	
	
	private String nama;
	
	
	private LevelWilayah level;
	
	
	private DateTime exp;
	
	
	private Wilayah induk;

	//Constructor
	public Wilayah(){}
	
	public Wilayah(int id, Wilayah induk, LevelWilayah level, String nama){
		this.setId(id);
		this.setInduk(induk);
		this.setLevel(level);
		this.setNama(nama);
	}
	
	//Setter getter
	
	@Id
	@Column(name = "ID", nullable = false, insertable = false, updatable = false)
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
	
	@JoinColumn(name = "LEVEL", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	public LevelWilayah getLevel() {
		return level;
	}

	public void setLevel(LevelWilayah level) {
		this.level = level;
	}

	@Column(name = "EXP", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	public DateTime getExp() {
		return exp;
	}

	public void setExp(DateTime exp) {
		this.exp = exp;
	}

	@JoinColumn(name = "INDUK", nullable = true)
	@ManyToOne(fetch = FetchType.LAZY)
	public Wilayah getInduk() {
		return induk;
	}

	public void setInduk(Wilayah induk) {
		this.induk = induk;
	}
	
	
	
	
}
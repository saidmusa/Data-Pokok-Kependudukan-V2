package id.ac.its.pbkk.kependudukan.domain;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
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
@JsonIgnoreProperties({"level"})
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
	@JsonProperty
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
	
	@Override public String toString(){
		String result = "{\"id\":"+this.id+",\"nama\":\""+this.nama+"\",\"levelwilayah\":"+this.level.getId()+",\"exp\":"+this.exp+",\"induk\":"+this.induk.getId()+"}";
		// "{\"id\":"+this.id+",\"nama\":\""+this.nama+"\",\"levelwilayah\":"+this.levelwilayah.getId()+",\"exp\":"+this.exp+",\"induk\":"+this.induk.getId()+"}"
		return result;
	}
	
	
}
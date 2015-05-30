package id.ac.its.pbkk.kependudukan.domain;
import org.joda.time.DateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AGAMA")
public class Agama {
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Column(name = "EXP_DATE", nullable = false)
	private DateTime exp;
	@Column(name = "NAMA", nullable = false)
	private String nama;
	
	public Agama(){}
	
	public Agama(String nama){
		this.setNama(nama);
	}
	public Agama(int id, String nama, DateTime exp){
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

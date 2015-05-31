package id.ac.its.pbkk.kependudukan.domain;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AKTE_CERAI")
public class AkteCerai {
	@Id
	@Column(name = "ID_AKTE_CERAI", nullable = false)
	private int id_akte_cerai;
	
	@Column(name = "ID_AKTE_NIKAH", nullable = false)
	private int id_akte_nikah;
	
	@Column(name = "TMPT_TERBIT", nullable = false, length = 11)
	private int tmpt_terbit;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "TGL_TERBIT", nullable = true)
	private DateTime tgl_terbit;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "TGL_CERAI", nullable = false)
	private DateTime tgl_cerai;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "TGL_PUTUSAN", nullable = false)
	private DateTime tgl_putusan;
	
	@Column(name = "NO_PUTUSAN", nullable = false)
	private String no_putusan;
	
	public AkteCerai(){}

	public int getId_akte_cerai() {
		return id_akte_cerai;
	}

	public void setId_akte_cerai(int id_akte_cerai) {
		this.id_akte_cerai = id_akte_cerai;
	}

	public int getId_akte_nikah() {
		return id_akte_nikah;
	}

	public void setId_akte_nikah(int id_akte_nikah) {
		this.id_akte_nikah = id_akte_nikah;
	}

	public int getTmpt_terbit() {
		return tmpt_terbit;
	}

	public void setTmpt_terbit(int tmpt_terbit) {
		this.tmpt_terbit = tmpt_terbit;
	}

	public DateTime getTgl_terbit() {
		return tgl_terbit;
	}

	public void setTgl_terbit(DateTime tgl_terbit) {
		this.tgl_terbit = tgl_terbit;
	}

	public DateTime getTgl_cerai() {
		return tgl_cerai;
	}

	public void setTgl_cerai(DateTime tgl_cerai) {
		this.tgl_cerai = tgl_cerai;
	}

	public DateTime getTgl_putusan() {
		return tgl_putusan;
	}

	public void setTgl_putusan(DateTime tgl_putusan) {
		this.tgl_putusan = tgl_putusan;
	}

	public String getNo_putusan() {
		return no_putusan;
	}

	public void setNo_putusan(String no_putusan) {
		this.no_putusan = no_putusan;
	}
	
	
}

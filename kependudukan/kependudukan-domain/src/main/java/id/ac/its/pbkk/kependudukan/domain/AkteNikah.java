package id.ac.its.pbkk.kependudukan.domain;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AKTE_NIKAH")
public class AkteNikah {
	@Id
	@Column(name = "ID_AKTE_NIKAH", nullable = false)
	private int id_akte_nikah;
	
	@Column(name = "ID_AKTE_CERAI", nullable = true)
	private int id_akte_cerai;
	
	@Column(name = "PEMUKA_AGAMA", nullable = false)
	private int pemuka_agama;
	
	@Column(name = "TMPT_TERBIT", nullable = false, length = 11)
	private int tmpt_terbit;
	
	@Column(name = "SUAMI", nullable = false)
	private int suami;
	
	@Column(name = "ISTRI", nullable = false)
	private int istri;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "TGL_TERBIT", nullable = true)
	private DateTime tgl_terbit;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@Column(name = "TGL_NIKAH", nullable = false)
	private DateTime tgl_nikah;
	
	public AkteNikah(){}

	public int getId_akte_nikah() {
		return id_akte_nikah;
	}

	public void setId_akte_nikah(int id_akte_nikah) {
		this.id_akte_nikah = id_akte_nikah;
	}

	public int getId_akte_cerai() {
		return id_akte_cerai;
	}

	public void setId_akte_cerai(int id_akte_cerai) {
		this.id_akte_cerai = id_akte_cerai;
	}

	public int getPemuka_agama() {
		return pemuka_agama;
	}

	public void setPemuka_agama(int pemuka_agama) {
		this.pemuka_agama = pemuka_agama;
	}

	public int getTmpt_terbit() {
		return tmpt_terbit;
	}

	public void setTmpt_terbit(int tmpt_terbit) {
		this.tmpt_terbit = tmpt_terbit;
	}

	public int getSuami() {
		return suami;
	}

	public void setSuami(int suami) {
		this.suami = suami;
	}

	public int getIstri() {
		return istri;
	}

	public void setIstri(int istri) {
		this.istri = istri;
	}

	public DateTime getTgl_terbit() {
		return tgl_terbit;
	}

	public void setTgl_terbit(DateTime tgl_terbit) {
		this.tgl_terbit = tgl_terbit;
	}

	public DateTime getTgl_nikah() {
		return tgl_nikah;
	}

	public void setTgl_nikah(DateTime tgl_nikah) {
		this.tgl_nikah = tgl_nikah;
	}
	
}

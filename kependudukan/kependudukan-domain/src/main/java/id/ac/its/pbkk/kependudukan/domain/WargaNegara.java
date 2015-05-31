package id.ac.its.pbkk.kependudukan.domain;
import java.util.UUID;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_WN")
public class WargaNegara {
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Wilayah getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(Wilayah tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

	public KK getKk() {
		return kk;
	}

	public void setKk(KK kk) {
		this.kk = kk;
	}

	public AkteMati getAkteMati() {
		return akteMati;
	}

	public void setAkteMati(AkteMati akteMati) {
		this.akteMati = akteMati;
	}

	public Agama getAgama() {
		return agama;
	}

	public void setAgama(Agama agama) {
		this.agama = agama;
	}

	public Wilayah getKwn() {
		return kwn;
	}

	public void setKwn(Wilayah kwn) {
		this.kwn = kwn;
	}

	public AkteLahir getAkteLahir() {
		return akteLahir;
	}

	public void setAkteLahir(AkteLahir akteLahir) {
		this.akteLahir = akteLahir;
	}

	public Pekerjaan getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(Pekerjaan pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public DateTime getCreated() {
		return created;
	}

	public void setCreated(DateTime created) {
		this.created = created;
	}

	public DateTime getUpdated() {
		return updated;
	}

	public void setUpdated(DateTime updated) {
		this.updated = updated;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public DateTime getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(DateTime tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getGolDarah() {
		return golDarah;
	}

	public void setGolDarah(String golDarah) {
		this.golDarah = golDarah;
	}

	public Boolean getIsHidup() {
		return isHidup;
	}

	public void setIsHidup(Boolean isHidup) {
		this.isHidup = isHidup;
	}

	public Integer getShdk() {
		return shdk;
	}

	public void setShdk(Integer shdk) {
		this.shdk = shdk;
	}

	public String getIsKawin() {
		return isKawin;
	}

	public void setIsKawin(String isKawin) {
		this.isKawin = isKawin;
	}

	@Id
	@Column(name = "ID", nullable = false)
	private UUID id;
	
	@JoinColumn(name = "TMPT_LAHIR", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Wilayah tempatLahir;
	
	@JoinColumn(name = "NO_KK", nullable = true)
	@ManyToOne(fetch = FetchType.LAZY)
	private KK kk;
	
	@JoinColumn(name = "AKTE_MATI", nullable = true)
	@ManyToOne(fetch = FetchType.LAZY)
	private AkteMati akteMati;
	
	@JoinColumn(name = "AGAMA", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Agama agama;
	
	@JoinColumn(name = "KWN", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Wilayah kwn;
	
	@JoinColumn(name = "AKTE_LAHIR", nullable = true)
	@ManyToOne(fetch = FetchType.LAZY)
	private AkteLahir akteLahir;
	
	@JoinColumn(name = "PEKERJAAN", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Pekerjaan pekerjaan;
	
	@Column(name = "CREATED", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime created;
	
	@Column(name = "UPDATED", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime updated;
	
	@Column(name = "NIK", nullable = false, length=16)
	private String nik;
	
	@Column(name = "NAMA", nullable = false, length=250)
	private String nama;
	
	@Column(name = "TGL_LAHIR", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggalLahir;
	
	@Column(name = "JK", nullable = false, length=1)
	private String jk;
	
	@Column(name = "GOL_DARAH", nullable = false, length=2)
	private String golDarah;
	
	@Column(name = "IS_HIDUP", nullable = false, length=1)
	private Boolean isHidup;
	
	@Column(name = "SHDK", nullable = false, length=11)
	private Integer shdk;
	
	@Column(name = "IS_KAWIN", nullable = false, length=1)
	private String isKawin;
}

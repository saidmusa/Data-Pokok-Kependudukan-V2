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
@Table(name = "TBL_KTP")
public class Mutasi {
	@Id
	@Column(name = "ID", nullable = false, length=16)
	private UUID id;
	
	@JoinColumn(name = "NO_REG_KTP", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private KTP noRegKTP;
	
	@JoinColumn(name = "TUJUAN", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Wilayah tujuan;
	
	@Column(name = "TGL_KELUAR", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggalKeluar;
	
	@Column(name = "TGL_MASUK", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggalMasuk;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public KTP getNoRegKTP() {
		return noRegKTP;
	}

	public void setNoRegKTP(KTP noRegKTP) {
		this.noRegKTP = noRegKTP;
	}

	public Wilayah getTujuan() {
		return tujuan;
	}

	public void setTujuan(Wilayah tujuan) {
		this.tujuan = tujuan;
	}

	public DateTime getTanggalKeluar() {
		return tanggalKeluar;
	}

	public void setTanggalKeluar(DateTime tanggalKeluar) {
		this.tanggalKeluar = tanggalKeluar;
	}

	public DateTime getTanggalMasuk() {
		return tanggalMasuk;
	}

	public void setTanggalMasuk(DateTime tanggalMasuk) {
		this.tanggalMasuk = tanggalMasuk;
	}
}

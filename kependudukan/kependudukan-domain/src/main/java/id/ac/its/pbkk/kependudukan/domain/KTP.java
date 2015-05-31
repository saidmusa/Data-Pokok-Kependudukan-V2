package id.ac.its.pbkk.kependudukan.domain;
import java.util.UUID;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_KTP")
public class KTP {
	@Id
	@Column(name = "NO_REG", nullable = false, length=16)
	private UUID noKTP;
	
	@JoinColumn(name = "ID_MUTASI", nullable = true)
	@ManyToOne(fetch = FetchType.LAZY)
	private Mutasi idMutasi;
	
	@JoinColumn(name = "TMPT_TERBIT", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Wilayah tempatTerbit;
	
	@JoinColumn(name = "PEMILIK_KTP", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private KTP pemilikKTP;
	
	@Column(name = "TGL_TERBIT", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggalTerbit;
	
	@Column(name = "ALAMAT", nullable = false, length=500)
	private String alamat;
	
	@Column(name = "BERLAKU_HINGGA", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime berlakuHingga;
	
	@Column(name = "FOTO", nullable = true)
	@Lob
	private Blob foto;
	
	@Column(name = "IS_BERLAKU", nullable = false)
	private Boolean isBerlaku;

	public UUID getNoKTP() {
		return noKTP;
	}

	public void setNoKTP(UUID noKTP) {
		this.noKTP = noKTP;
	}

	public Mutasi getIdMutasi() {
		return idMutasi;
	}

	public void setIdMutasi(Mutasi idMutasi) {
		this.idMutasi = idMutasi;
	}

	public Wilayah getTempatTerbit() {
		return tempatTerbit;
	}

	public void setTempatTerbit(Wilayah tempatTerbit) {
		this.tempatTerbit = tempatTerbit;
	}

	public KTP getPemilikKTP() {
		return pemilikKTP;
	}

	public void setPemilikKTP(KTP pemilikKTP) {
		this.pemilikKTP = pemilikKTP;
	}

	public DateTime getTanggalTerbit() {
		return tanggalTerbit;
	}

	public void setTanggalTerbit(DateTime tanggalTerbit) {
		this.tanggalTerbit = tanggalTerbit;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public DateTime getBerlakuHingga() {
		return berlakuHingga;
	}

	public void setBerlakuHingga(DateTime berlakuHingga) {
		this.berlakuHingga = berlakuHingga;
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

	public Boolean getIsBerlaku() {
		return isBerlaku;
	}

	public void setIsBerlaku(Boolean isBerlaku) {
		this.isBerlaku = isBerlaku;
	}
	
	
	
}

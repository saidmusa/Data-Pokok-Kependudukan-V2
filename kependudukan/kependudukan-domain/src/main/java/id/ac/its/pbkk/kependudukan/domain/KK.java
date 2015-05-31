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
@Table(name = "TBL_KK")
public class KK {
	@Id
	@Column(name = "NO_KK", nullable = false)
	private UUID noKK;
	
	@JoinColumn(name = "TMPT_TERBIT", nullable = true)
	@ManyToOne(fetch = FetchType.LAZY)
	private Wilayah tempatTerbit;
	
	@Column(name = "CREATED", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime created;
	
	@Column(name = "UPDATED", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime updated;
	
	@Column(name = "TGL_TERBIT", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggalTerbit;
	
	@Column(name = "ALAMAT", nullable = true, length=500)
	private String alamat;

	public UUID getNoKK() {
		return noKK;
	}

	public void setNoKK(UUID noKK) {
		this.noKK = noKK;
	}

	public Wilayah getTempatTerbit() {
		return tempatTerbit;
	}

	public void setTempatTerbit(Wilayah tempatTerbit) {
		this.tempatTerbit = tempatTerbit;
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
}

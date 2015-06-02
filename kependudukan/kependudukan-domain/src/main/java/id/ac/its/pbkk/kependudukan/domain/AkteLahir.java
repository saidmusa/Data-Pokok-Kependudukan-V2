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
@Table(name = "TBL_AKTE_KELAHIRAN")
public class AkteLahir {
	@Id
	@Column(name = "ID_AKTE_LAHIR", nullable = false)
	private UUID id;
	
	@JoinColumn(name = "PEMILIK", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private WargaNegara pemilik;
	
	@JoinColumn(name = "BAPAK", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private WargaNegara bapak;

	@JoinColumn(name = "IBU", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private WargaNegara ibu;
	
	@JoinColumn(name = "TMPT_TERBIT", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Wilayah tempatTerbit;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public WargaNegara getPemilik() {
		return pemilik;
	}

	public void setPemilik(WargaNegara pemilik) {
		this.pemilik = pemilik;
	}

	public WargaNegara getBapak() {
		return bapak;
	}

	public void setBapak(WargaNegara bapak) {
		this.bapak = bapak;
	}

	public WargaNegara getIbu() {
		return ibu;
	}

	public void setIbu(WargaNegara ibu) {
		this.ibu = ibu;
	}

	public Wilayah getTempatTerbit() {
		return tempatTerbit;
	}

	public void setTempatTerbit(Wilayah tempatTerbit) {
		this.tempatTerbit = tempatTerbit;
	}
	
	
}

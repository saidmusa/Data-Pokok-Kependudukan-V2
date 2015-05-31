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
@Table(name = "TBL_AKTE_KEMATIAN")
public class AkteMati {
	@Id
	@Column(name = "ID_AKTE_MATI", nullable = false)
	private UUID id;
	
	@JoinColumn(name = "TMPT_TERBIT", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Wilayah tempatTerbit;
	
	@JoinColumn(name = "PEMILIK", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private WargaNegara pemilik;
	
	@Column(name = "TGL_TERBIT", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tglTerbit;
	
	@Column(name = "TGL_MATI", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tglMati;
}

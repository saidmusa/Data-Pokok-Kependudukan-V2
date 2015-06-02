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
@Table(name = "TBL_RIWAYAT_KK")
public class RiwayatKK {
	@Id
	@Column(name = "ID_LOG", nullable = false)
	private Integer idLog;
	
	@Column(name = "NO_KK", nullable = false)
	private UUID kk;
	
	@JoinColumn(name = "TMPT_TERBIT", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Wilayah tempatTerbit;
	
	@Column(name = "CREATED", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime created;
	
	@Column(name = "UPDATED", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime updated;
	
	@Column(name = "TGL_TERBIT", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggalTerbit;
	
	@Column(name = "ALAMAT", nullable = false, length=500)
	private String alamat;
}

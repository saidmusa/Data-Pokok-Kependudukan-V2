package id.ac.its.pbkk.kependudukan.domain;
import java.util.UUID;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_RIWAYAT_WN")
public class RiwayatWN {
	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Column(name = "WN", nullable = false)
	private WargaNegara wn;
	
	@Column(name = "TMPT_LAHIR", nullable = false)
	private Wilayah tempatLahir;
	
	@Column(name = "NO_KK", nullable = false)
	private KK kk;
	
	@Column(name = "AKTE_MATI", nullable = false)
	private AkteMati akteMati;
	
	@Column(name = "AGAMA", nullable = false)
	private Agama agama;
	
	@Column(name = "KWN", nullable = false)
	private Wilayah kwn;
	
	@Column(name = "AKTE_LAHIR", nullable = false)
	private AkteLahir akteLahir;
	
	@Column(name = "PEKERJAAN", nullable = false)
	private Pekerjaan pekerjaan;
	
	@Column(name = "CREATED", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime created;
	
	@Column(name = "UPDATED", nullable = true)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime updated;
	
	@Column(name = "NIK", nullable = false)
	private UUID nik;
	
	@Column(name = "NAMA", nullable = false, length=250)
	private String nama;
	
	@Column(name = "TGL_LAHIR", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime tanggalLahir;
	
	@Column(name = "JK", nullable = false, length=1)
	private String jk;
	
	@Column(name = "GOL_DARAH", nullable = false, length=2)
	private String golDarah;
	
	@Column(name = "IS_HIDUP", nullable = false)
	private Boolean isHidup;
	
	@Column(name = "SHDK", nullable = false)
	private Integer shdk;
	
	@Column(name = "IS_KAWIN", nullable = false)
	private Boolean isKawin;
}

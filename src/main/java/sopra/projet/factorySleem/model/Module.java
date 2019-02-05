package sopra.projet.factorySleem.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "modules")
public class Module {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	@OneToOne
	@JoinColumn(name = "code_salle")
	private Salle salle;
	@OneToOne
	@JoinColumn(name = "code_videoprojecteur")
	private VideoProjecteur videoprojecteur;
	@ManyToOne
	@JoinColumn(name = "matiere_id")
	private Matiere matiere;
	@ManyToOne
	@JoinColumn(name = "formation_id")
	private Formation formation;

	public Module() {
		super();
	}

	public Module(Salle salle, VideoProjecteur videoprojecteur, Matiere matiere, Formation formation) {
		super();
		this.salle = salle;
		this.videoprojecteur = videoprojecteur;
		this.matiere = matiere;
		this.formation = formation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public VideoProjecteur getVideoprojecteur() {
		return videoprojecteur;
	}

	public void setVideoprojecteur(VideoProjecteur videoprojecteur) {
		this.videoprojecteur = videoprojecteur;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	@Override
	public String toString() {
		return "Module [id=" + id + ", version=" + version + ", salle=" + salle + ", videoprojecteur=" + videoprojecteur
				+ ", matiere=" + matiere + ", formation=" + formation + "]";
	}

}

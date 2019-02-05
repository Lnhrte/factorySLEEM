package sopra.projet.factorySleem.model;

public class Module {
	private long id;
	private int version;
	private Salle salle;
	private VideoProjecteur videoprojecteur;
	private Matiere matiere;
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

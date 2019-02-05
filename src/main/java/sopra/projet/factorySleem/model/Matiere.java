package sopra.projet.factorySleem.model;

import java.util.List;

public class Matiere {
	private long id;
	private int version;
	private String titre;
	private int duree;
	private String objectif;
	private String prerequis;
	private String contenu;
	private Niveau niveau;
	private List<Module> modules;

	public Matiere() {
	}

	public Matiere(String titre, int duree, String objectif, String prerequis, String contenu, Niveau niveau,
			List<Module> modules) {
		super();
		this.titre = titre;
		this.duree = duree;
		this.objectif = objectif;
		this.prerequis = prerequis;
		this.contenu = contenu;
		this.niveau = niveau;
		this.modules = modules;
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

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getObjectif() {
		return objectif;
	}

	public void setObjectif(String objectif) {
		this.objectif = objectif;
	}

	public String getPrerequis() {
		return prerequis;
	}

	public void setPrerequis(String prerequis) {
		this.prerequis = prerequis;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "Matiere [id=" + id + ", version=" + version + ", titre=" + titre + ", duree=" + duree + ", objectif="
				+ objectif + ", prerequis=" + prerequis + ", contenu=" + contenu + ", niveau=" + niveau + ", modules="
				+ modules + "]";
	}

}
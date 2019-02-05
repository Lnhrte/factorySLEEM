package sopra.projet.factorySleem.model;

public class Technicien extends RessourcesHumaines{

	private String motDePasse;

	
	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, String motDePasse) {
		super(nom, prenom);
		this.motDePasse = motDePasse;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
	
}

package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("technicien")
public class Technicien extends RessourcesHumaines{

	@Column(name = "motDePasse")
	private String motDePasse;

	
	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, String motDePasse) {
		super(nom, prenom);
		this.motDePasse = motDePasse;
	}
	public Technicien(String nom, String prenom) {
		super(nom, prenom);
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		return "Technicien [motDePasse=" + motDePasse + "]";
	}
	
	
	
}

package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("technicien")
public class Technicien extends RessourcesHumaines{

	@Column(name = "motDePasse")
	private String motDePasse;


	
	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, String motDePasse) {
		super(nom,prenom);
		this.motDePasse = motDePasse;
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

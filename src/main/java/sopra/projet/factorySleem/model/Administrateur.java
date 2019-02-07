package sopra.projet.factorySleem.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends RessourcesHumaines {

	private String motDePasse;

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Administrateur(String nom, String prenom, String motDePasse) {
		super(nom, prenom);
		this.motDePasse = motDePasse;

	}

	public Administrateur() {
		super();
	}

}

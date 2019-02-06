package sopra.projet.factorySleem.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends RessourcesHumaines {

	private String motDePasse;
	@OneToOne
	@JoinColumn(name = "adresse_Id")
	private Adresse adresse;
	@OneToOne
	@JoinColumn(name = "coordonnees_Id")
	private Coordonnees coordonnees;

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Coordonnees getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

	public Administrateur(String nom, String prenom, String motDePasse, Adresse adresse, Coordonnees coordonnees) {
		super(nom, prenom);
		this.motDePasse = motDePasse;
		this.adresse = adresse;
		this.coordonnees = coordonnees;
	}

	public Administrateur() {
		super();
	}

}

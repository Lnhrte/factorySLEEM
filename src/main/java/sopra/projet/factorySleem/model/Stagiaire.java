
package sopra.projet.factorySleem.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("stagiaire")
public class Stagiaire extends RessourcesHumaines {
	@OneToOne
	@JoinColumn(name = "ordinateur_Id")
	private Ordinateur ordinateur;
	@ManyToOne
	@JoinColumn(name = "formation_Id")
	private Formation formation;

	@OneToOne
	@JoinColumn(name = "adresse_Id")
	private Adresse adresse;
	@OneToOne
	@JoinColumn(name = "coordonnees_Id")
	private Coordonnees coordonnees;

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

	public Ordinateur getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(Ordinateur ordinateur) {
		this.ordinateur = ordinateur;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Stagiaire() {
		super();
	}

	public Stagiaire(String nom, String prenom, Ordinateur ordinateur) {
		super(nom, prenom);
		this.ordinateur = ordinateur;
	}

	@Override
	public String toString() {
		return "Stagiaire [ordinateur=" + ordinateur + ", formation=" + formation + "]";
	}

}

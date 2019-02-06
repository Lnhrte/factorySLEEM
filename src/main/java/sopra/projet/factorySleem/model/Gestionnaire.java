package sopra.projet.factorySleem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("gestionnaire")
public class Gestionnaire extends RessourcesHumaines {
	@Column(name = "motDePasse")
	private String motDePasse;
	@OneToMany(mappedBy = "gestionnaire")
	private List<Formation> formations;

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

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
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

	public Gestionnaire() {
		super();
	}

	public Gestionnaire(String nom, String prenom, String motDePasse, Adresse adresse, Coordonnees coordonnees) {
		super(nom, prenom);
		this.motDePasse = motDePasse;
		this.adresse = adresse;
		this.coordonnees = coordonnees;
	}

	@Override
	public String toString() {
		return "Gestionnaire [motDePasse=" + motDePasse + ", formation=" + formations + "]";
	}

}

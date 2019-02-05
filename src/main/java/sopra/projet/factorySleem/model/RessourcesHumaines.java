package sopra.projet.factorySleem.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table (name="ressourcesHumaines")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class RessourcesHumaines {
	@Id
	@GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	@Embedded
	private Adresse adresse;
	@Embedded
	private Coordonnees coordonnees;
	@Version
	private int version;

	public RessourcesHumaines() {
		super();
	}

	public RessourcesHumaines(String nom, String prenom, Adresse adresse, Coordonnees coordonnees) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.coordonnees = coordonnees;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}

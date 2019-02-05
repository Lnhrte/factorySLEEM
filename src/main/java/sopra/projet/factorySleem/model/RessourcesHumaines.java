package sopra.projet.factorySleem.model;

import javax.persistence.Column;
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
@Table(name = "ressources_humaines")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class RessourcesHumaines {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Embedded
	@Column(nullable=true)
	private Adresse adresse;
	@Embedded
	private Coordonnees coordonnees;
	@Version
	private int version;

	public RessourcesHumaines() {
		super();
	}

	public RessourcesHumaines(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public RessourcesHumaines(String nom, String prenom, Adresse adresse, Coordonnees coordonnees) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.coordonnees = coordonnees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

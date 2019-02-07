package sopra.projet.factorySleem.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Version
	private int version;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "numero", column = @Column(name = "numero")),
			@AttributeOverride(name = "rue", column = @Column(name = "rue", length = 200)),
			@AttributeOverride(name = "codePostal", column = @Column(name = "code_postal", length = 20)),
			@AttributeOverride(name = "ville", column = @Column(name = "ville", length = 150)),
			@AttributeOverride(name = "pays", column = @Column(name = "pays", length = 150)) })
	private Adresse adresse;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "telephone", column = @Column(name = "telephone")),
		@AttributeOverride(name = "email", column = @Column(name = "email", length = 200)) })
	private Coordonnees coordonnees;

	public RessourcesHumaines() {
		super();
	}

	public RessourcesHumaines(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
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

}
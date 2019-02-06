package sopra.projet.factorySleem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Coordonnees {

	@Id
	@GeneratedValue
	private Long id;
	private String telephone;
	private String email;
	@Version
	private int version;
	
	@OneToOne(mappedBy="coordonnees")
	private Administrateur administrateur;
	@OneToOne(mappedBy="coordonnees")
	private Technicien technicien;
	@OneToOne(mappedBy="coordonnees")
	private Gestionnaire gestionnaire;
	@OneToOne(mappedBy="coordonnees")
	private Formateur formateur;
	@OneToOne(mappedBy="coordonnees")
	private Stagiaire stagiaire;
	
	

	public Coordonnees() {
		super();
	}

	public Coordonnees(String telephone, String email) {
		super();
		this.telephone = telephone;
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	public Technicien getTechnicien() {
		return technicien;
	}

	public void setTechnicien(Technicien technicien) {
		this.technicien = technicien;
	}

	public Gestionnaire getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Stagiaire getStagiaire() {
		return stagiaire;
	}

	public void setStagiaire(Stagiaire stagiaire) {
		this.stagiaire = stagiaire;
	}
	
	

}

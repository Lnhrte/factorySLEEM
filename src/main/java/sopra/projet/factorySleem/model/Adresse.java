package sopra.projet.factorySleem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Adresse{
	
	@Id
	@GeneratedValue
	private Long id;
	private int numero;
	private String rue;
	private String codePostale;
	private String ville;
	private String pays;
	@Version
	private int version;
	
	@OneToOne(mappedBy="adresse")
	private Administrateur administrateur;
	@OneToOne(mappedBy="adresse")
	private Technicien technicien;
	@OneToOne(mappedBy="adresse")
	private Gestionnaire gestionnaire;
	@OneToOne(mappedBy="adresse")
	private Formateur formateur;
	@OneToOne(mappedBy="adresse")
	private Stagiaire stagiaire;

	public Adresse() {
		super();
	}
	

	public Adresse(int numero, String rue, String codePostale, String ville, String pays) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.codePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
	}



	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
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

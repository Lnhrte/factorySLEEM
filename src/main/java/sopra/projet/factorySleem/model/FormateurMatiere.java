package sopra.projet.factorySleem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="formateurs_matieres")
public class FormateurMatiere {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@ManyToOne
	@JoinColumn(name="formateur_id")
	private Formateur formateur;
	@ManyToOne
	@JoinColumn(name="matiere_id")
	private Matiere matiere;

	public FormateurMatiere() {
	}

	public FormateurMatiere(Formateur formateur, Matiere matiere) {
		this.formateur = formateur;
		this.matiere = matiere;
	}

	public Formateur getFormateur() {
		return this.formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Matiere getMatiere() {
		return this.matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public FormateurMatiere formateur(Formateur formateur) {
		this.formateur = formateur;
		return this;
	}

	public FormateurMatiere matiere(Matiere matiere) {
		this.matiere = matiere;
		return this;
	}

	@Override
	public String toString() {
		return "FormateurMatiere [formateur=" + formateur + ", matiere=" + matiere + "]";
	}

}
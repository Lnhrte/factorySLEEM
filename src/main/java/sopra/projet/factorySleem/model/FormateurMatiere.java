package sopra.projet.factorySleem.model;

public class FormateurMatiere {
	private Formateur formateur;
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
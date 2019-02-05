package sopra.projet.factorySleem.model;

import java.util.Date;
import java.util.List;

public class Formateur extends RessourcesHumaines {
	private String motDePasse;
	private Date indisponibleDebut;
	private Date indisponibleFin;
	private List<FormateurMatiere> matieres;

	public Formateur() {
		super();
	}

	public Formateur(String motDePasse, Date indisponibleDebut, Date indisponibleFin, List<FormateurMatiere> matieres) {
		super();
		this.motDePasse = motDePasse;
		this.indisponibleDebut = indisponibleDebut;
		this.indisponibleFin = indisponibleFin;
		this.matieres = matieres;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Date getIndisponibleDebut() {
		return indisponibleDebut;
	}

	public void setIndisponibleDebut(Date indisponibleDebut) {
		this.indisponibleDebut = indisponibleDebut;
	}

	public Date getIndisponibleFin() {
		return indisponibleFin;
	}

	public void setIndisponibleFin(Date indisponibleFin) {
		this.indisponibleFin = indisponibleFin;
	}

	public List<FormateurMatiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<FormateurMatiere> matieres) {
		this.matieres = matieres;
	}

	@Override
	public String toString() {
		return "Formateur [motDePasse=" + motDePasse + ", indisponibleDebut=" + indisponibleDebut + ", indisponibleFin="
				+ indisponibleFin + ", matieres=" + matieres + "]";
	}

}

package sopra.projet.factorySleem.model;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@DiscriminatorValue("formateur")
public class Formateur extends RessourcesHumaines {
	private String motDePasse;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date indisponibleDebut;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date indisponibleFin;
	@OneToMany(mappedBy = "formateur", fetch = FetchType.LAZY)
	private List<FormateurMatiere> matieres;
	@OneToMany(mappedBy = "formateur", fetch = FetchType.LAZY)
	private List<Module> modules;

	public Formateur() {
		super();
	}

	public Formateur(String nom, String prenom, String motDePasse, Date indisponibleDebut, Date indisponibleFin) {
		super(nom, prenom);
		this.motDePasse = motDePasse;
		this.indisponibleDebut = indisponibleDebut;
		this.indisponibleFin = indisponibleFin;
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

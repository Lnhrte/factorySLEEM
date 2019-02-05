package sopra.projet.factorySleem.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Formation {
	@Id
	@GeneratedValue
	private long id;
	@Version
	private int version;
	@Column(name = "dateDebut")
	private Date dateDebut;
	@Column(name = "dateFin")
	private Date dateFin;
	@ManyToOne
	@JoinColumn(name = "gestionnaire_Id")
	private Gestionnaire gestionnaire;
	@OneToMany(mappedBy = "formation")
	private List<Stagiaire> stagiaires;
	@OneToMany(mappedBy = "formation")
	private List<Module> Modules;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Gestionnaire getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public List<Stagiaire> getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(List<Stagiaire> stagiaires) {
		this.stagiaires = stagiaires;
	}

	public Formation() {
	}

	public Formation(Date dateDebut, Date dateFin) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", version=" + version + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", gestionnaire=" + gestionnaire + ", stagiaires=" + stagiaires + ", Modules=" + Modules + "]";
	}

}

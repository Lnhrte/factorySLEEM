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
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "formations")
public class Formation {
	@Id
	@GeneratedValue
	private Long id;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public void setVersion(int version) {
		this.version = version;
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

	public List<Module> getModules() {
		return Modules;
	}

	public void setModules(List<Module> modules) {
		Modules = modules;
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

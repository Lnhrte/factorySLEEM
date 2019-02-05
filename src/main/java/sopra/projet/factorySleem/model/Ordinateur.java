package sopra.projet.factorySleem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("ordinateur")
public class Ordinateur extends RessourcesMaterielles {
	@Column(name = "processeur")
	private String processeur;
	@Column(name = "ram")
	private int ram;
	@Column(name = "disqueDur")
	private int disqueDur;
	@Column(name = "anneeAchat")
	@Temporal(TemporalType.DATE)
	private Date anneeAchat;
	@OneToOne(mappedBy = "ordinateur")
	Stagiaire stagiaire;

	public Ordinateur() {
		super();
	}

	public Ordinateur(String code, int cout, String processeur, int ram, int disqueDur, Date anneeAchat) {
		super(code, cout);
		this.processeur = processeur;
		this.ram = ram;
		this.disqueDur = disqueDur;
		this.anneeAchat = anneeAchat;
	}

	public String getProcesseur() {
		return processeur;
	}

	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getDisqueDur() {
		return disqueDur;
	}

	public void setDisqueDur(int disqueDur) {
		this.disqueDur = disqueDur;
	}

	public Date getAnneeAchat() {
		return anneeAchat;
	}

	public void setAnneeAchat(Date anneeAchat) {
		this.anneeAchat = anneeAchat;
	}

	public Stagiaire getStagiaire() {
		return stagiaire;
	}

	public void setStagiaire(Stagiaire stagiaire) {
		this.stagiaire = stagiaire;
	}

	@Override
	public String toString() {
		return "Ordinateur [processeur=" + processeur + ", ram=" + ram + ", disqueDur=" + disqueDur + ", anneeAchat="
				+ anneeAchat + "]";
	}

}

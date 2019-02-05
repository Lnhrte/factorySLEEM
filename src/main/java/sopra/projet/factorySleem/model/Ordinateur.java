package sopra.projet.factorySleem.model;

import java.util.Date;

public class Ordinateur extends RessourcesMaterielles {
	private String processeur;
	private int ram;
	private int disqueDur;
	private Date anneeAchat;

	public Ordinateur() {
		super();
	}

	public Ordinateur(String cout, String processeur, int ram, int disqueDur, Date anneeAchat) {
		super(cout);
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

}

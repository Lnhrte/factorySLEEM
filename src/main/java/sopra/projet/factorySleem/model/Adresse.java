package sopra.projet.factorySleem.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Version;

@Embeddable
public class Adresse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int numero;
	private String rue;
	private String codePostale;
	private String ville;
	private String pays;
	@Version
	private int version;

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

}

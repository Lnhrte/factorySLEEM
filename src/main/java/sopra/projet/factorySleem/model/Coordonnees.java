package sopra.projet.factorySleem.model;

import javax.persistence.Embeddable;
import javax.persistence.Version;

@Embeddable
public class Coordonnees {

	private String telephone;
	private String email;
	@Version
	private int version;

	public Coordonnees() {
		super();
	}

	public Coordonnees(String telephone, String email) {
		super();
		this.telephone = telephone;
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

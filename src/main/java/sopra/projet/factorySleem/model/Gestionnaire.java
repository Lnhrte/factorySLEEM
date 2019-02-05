package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
@DiscriminatorValue("gestionnaire")
public class Gestionnaire extends RessourcesHumaines {
	@Id
	@GeneratedValue
	private long id;
	@Version
	private int version;
	@Column(name = "motDePasse")
	private String motDePasse;
	@OneToMany(mappedBy = "gestionnaire")
	private Formation formation;

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Gestionnaire() {
	}

	public Gestionnaire(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		return "Gestionnaire [id=" + id + ", version=" + version + ", motDePasse=" + motDePasse + ", formation="
				+ formation + "]";
	}

}

package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("gestionnaire")
public class Gestionnaire extends RessourcesHumaines {
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

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Gestionnaire() {
	}

	public Gestionnaire(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		return "Gestionnaire [motDePasse=" + motDePasse + ", formation=" + formation + "]";
	}

}

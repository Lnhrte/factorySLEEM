package sopra.projet.factorySleem.model;

import java.util.List;

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
	private List<Formation> formations;
	
	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public Gestionnaire() {
	}

	public Gestionnaire(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		return "Gestionnaire [motDePasse=" + motDePasse + ", formation=" + formations + "]";
	}

}

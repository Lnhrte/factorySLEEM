
package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("stagiaire")
public class Stagiaire extends RessourcesHumaines {
	@Column(name = "ordinateur")
	private Ordinateur ordinateur;
	@ManyToOne
	@JoinColumn(name = "formation_Id")
	private Formation formation;
	
	public Ordinateur getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(Ordinateur ordinateur) {
		this.ordinateur = ordinateur;
	}
	
	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Stagiaire() {
		super();
	}

	public Stagiaire(Ordinateur ordinateur) {
		super();
		this.ordinateur = ordinateur;
	}

	@Override
	public String toString() {
		return "Stagiaire [ordinateur=" + ordinateur + ", formation=" + formation + "]";
	}


}

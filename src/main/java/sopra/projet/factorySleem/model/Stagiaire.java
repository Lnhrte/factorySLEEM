
package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@DiscriminatorValue("stagiaire")
public class Stagiaire extends RessourcesHumaines {
	@Id
	@GeneratedValue
	private long id;
	@Version
	private int version;
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

	public Stagiaire() {
		super();
	}

	public Stagiaire(Ordinateur ordinateur) {
		super();
		this.ordinateur = ordinateur;
	}

	@Override
	public String toString() {
		return "Stagiaire [id=" + id + ", version=" + version + ", ordinateur=" + ordinateur + ", formation="
				+ formation + "]";
	}

}

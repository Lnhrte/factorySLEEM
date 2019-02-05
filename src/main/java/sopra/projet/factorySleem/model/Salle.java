package sopra.projet.factorySleem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("salle")
public class Salle extends RessourcesMaterielles{

	@Column(name = "capacite")
	private int capacite;

	
	public Salle() {
		super();
	}

	public Salle(String code, int cout, int capacite) {
		super(code, cout);
		this.capacite = capacite;
	}
	
	
	

	public int getCapacite() {
		return capacite;
	}



	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	@Override
	public String toString() {
		return "Salle [capacite=" + capacite + "]";
	}
	
	
}

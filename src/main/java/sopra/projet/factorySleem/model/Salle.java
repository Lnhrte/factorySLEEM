package sopra.projet.factorySleem.model;

public class Salle extends RessourcesMaterielles{

	private int capacite;

	
	public Salle() {
		super();
	}

	public Salle(String cout, int capacite) {
		super(cout);
		this.capacite = capacite;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	
	
	
}

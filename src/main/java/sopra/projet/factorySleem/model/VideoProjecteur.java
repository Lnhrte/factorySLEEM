package sopra.projet.factorySleem.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("videoProjecteur")
public class VideoProjecteur extends RessourcesMaterielles {

	public VideoProjecteur() {
		super();
	}

	public VideoProjecteur(String code, int cout) {
		super(code, cout);
	}

}

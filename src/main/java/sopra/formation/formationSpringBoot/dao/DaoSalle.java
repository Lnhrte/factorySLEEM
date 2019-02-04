package sopra.formation.formationSpringBoot.dao;

import sopra.projet.factorySleem.model.Salle;

public interface DaoSalle extends DaoGeneric<Salle, Integer> {
	Salle findByIdWithPersonnes(Integer key);
}

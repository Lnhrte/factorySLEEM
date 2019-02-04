package sopra.formation.formationSpringBoot.dao;

import java.util.List;

import sopra.projet.factorySleem.model.Formateur;
import sopra.projet.factorySleem.model.Personne;
import sopra.projet.factorySleem.model.Stagiaire;

public interface DaoPersonne extends DaoGeneric<Personne, Integer> {
	List<Formateur> findAllFormateur();

	List<Stagiaire> findAllStagiaire();
}

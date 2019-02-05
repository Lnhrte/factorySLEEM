package sopra.projet.factorySleem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.projet.factorySleem.model.Formation;
import sopra.projet.factorySleem.model.Stagiaire;

public interface StagiaireRepository extends JpaRepository<Stagiaire, Long>{
	@Query("select distinct s from Stagiaire s")
	List<Stagiaire>findAllStagiaire();
}

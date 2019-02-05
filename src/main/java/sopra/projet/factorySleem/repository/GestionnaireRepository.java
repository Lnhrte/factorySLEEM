package sopra.projet.factorySleem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.projet.factorySleem.model.Formation;
import sopra.projet.factorySleem.model.Gestionnaire;

public interface GestionnaireRepository extends JpaRepository<Gestionnaire, Long>{
	@Query("select distinct g from Gestionnaire g")
	List<Gestionnaire>findAllGestionnaire();
}

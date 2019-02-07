package sopra.projet.factorySleem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.projet.factorySleem.model.Formateur;
import sopra.projet.factorySleem.model.RessourcesHumaines;

public interface FormateurRepository extends JpaRepository<RessourcesHumaines, Long> {
	@Query("select distinct f from Formateur f")
	List<Formateur>findAllFormateur();
}

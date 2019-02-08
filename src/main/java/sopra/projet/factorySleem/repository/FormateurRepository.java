package sopra.projet.factorySleem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.projet.factorySleem.model.Formateur;
import sopra.projet.factorySleem.model.RessourcesHumaines;

public interface FormateurRepository extends JpaRepository<RessourcesHumaines, Long> {
	@Query("select distinct f from Formateur f")
	List<Formateur>findAllFormateur();
	
	@Query("select f from Formateur f left join fetch f.matieres where f.id=:id")
	Optional<Formateur> findByIdWithMatiere(@Param("id") Long id);
	
}

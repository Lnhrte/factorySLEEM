package sopra.projet.factorySleem.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.projet.factorySleem.model.FormateurMatiere;

public interface FormateurMatiereRepository extends JpaRepository<FormateurMatiere, Long> {
	@Query("select fm from FormateurMatiere fm where fm.formateur.id=:id")
	ArrayList<FormateurMatiere> findByIdWithFormateur(@Param("id") Long id);
	
	@Query("select fm from FormateurMatiere fm where fm.matiere.id=:id")
	ArrayList<FormateurMatiere> findByIdWithMatiere(@Param("id") Long id);
}

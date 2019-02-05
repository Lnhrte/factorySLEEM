package sopra.projet.factorySleem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.projet.factorySleem.model.Ordinateur;
import sopra.projet.factorySleem.model.RessourcesMaterielles;
import sopra.projet.factorySleem.model.Salle;
import sopra.projet.factorySleem.model.VideoProjecteur;

public interface RessourcesMateriellesRepository extends JpaRepository<RessourcesMaterielles, String>{
	
//	@Query("select ordinateur from RessourcesMaterielles")
//	List<Ordinateur>findAllOrdinateur();
	
//	List<RessourcesMaterielles>findAll();
//	List<Ordinateur>findAllOrdinateur();
//	List<VideoProjecteur>findAllVideoProjecteur();
//	List<Salle>findAllSalle();
//	
	
	
	
}

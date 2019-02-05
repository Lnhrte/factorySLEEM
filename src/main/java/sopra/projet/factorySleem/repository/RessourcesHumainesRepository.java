package sopra.projet.factorySleem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import sopra.projet.factorySleem.model.Adresse;
//import sopra.projet.factorySleem.model.Coordonnees;
import sopra.projet.factorySleem.model.RessourcesHumaines;

public interface RessourcesHumainesRepository extends JpaRepository<RessourcesHumaines, Long> {

//	@Query("select s from ressources_humaines")
//	Optional<RessourcesHumaines> findByType(@Param("type") String type);
//
//	@Query("select adresse from ressourcesHumaines")
//	Optional<RessourcesHumaines> findByAdresses(@Param("adresse") Adresse adresse);
//
//	@Query("select telephone from ressourcesHumaines")
//	Optional<RessourcesHumaines> findByTelephone(@Param("telephone") String telephone);
//
//	@Query("select email from ressourcesHumaines")
//	Optional<RessourcesHumaines> findByEmail(@Param("email") String email);

}

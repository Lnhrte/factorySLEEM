package sopra.projet.factorySleem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.projet.factorySleem.model.Salle;

public interface SalleRepository extends JpaRepository<Salle, Integer> {
//	List<Salle> findByNomLike(String nom);

//	@Query("select s from Salle s left join fetch s.personnes where s.numero=:numero")
//	Optional<Salle> findByIdWithPersonnes(@Param("numero") Integer id);

//	List<Salle> findAllWithPersonnes();
}
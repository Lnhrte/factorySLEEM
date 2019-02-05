package sopra.projet.factorySleem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.projet.factorySleem.model.RessourcesMaterielles;
import sopra.projet.factorySleem.model.Salle;

public interface SalleRepository extends JpaRepository<RessourcesMaterielles, String> {

}
package sopra.projet.factorySleem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.projet.factorySleem.model.RessourcesHumaines;

public interface TechnicienRepository extends JpaRepository<RessourcesHumaines, Long> {

}

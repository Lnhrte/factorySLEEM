package sopra.projet.factorySleem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.projet.factorySleem.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {

	@Query("select u from Utilisateur u left join fetch u.roles where u.identifiant=?1")
	public Optional<Utilisateur> findByIdWithRoles(String identifiant);
}

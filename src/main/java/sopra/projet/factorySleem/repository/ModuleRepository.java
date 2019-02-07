package sopra.projet.factorySleem.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.projet.factorySleem.model.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

	@Query("select m from Module m where m.formation.id=:id")
	ArrayList<Module> findByIdWithFormation(@Param("id") Long id);
}

package sopra.formation.formationSpringBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sopra.projet.factorySleem.model.Matiere;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
class DaoMatiereJpaImpl implements DaoMatiere {

	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void create(Matiere obj) {
		em.persist(obj);
	}

	@Override
	public Matiere findByKey(Integer key) {
		Matiere p = null;
		p = em.find(Matiere.class, key);
		return p;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Matiere update(Matiere obj) {
		Matiere p = null;
		p = em.merge(obj);
		return p;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Matiere obj) {
		em.remove(em.merge(obj));
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteByKey(Integer key) {
		em.remove(em.find(Matiere.class, key));
	}

	@Override
	public List<Matiere> findAll() {
		Query query = em.createQuery("from Matiere p");
		List<Matiere> salles = null;
		salles = query.getResultList();
		return salles;
	}

}

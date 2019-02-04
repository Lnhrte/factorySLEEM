package sopra.formation.formationSpringBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sopra.projet.factorySleem.model.Salle;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
class DaoSalleJpaImpl implements DaoSalle {

	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void create(Salle obj) {
		em.persist(obj);
	}

	@Override
	public Salle findByKey(Integer key) {
		Salle p = null;
		p = em.find(Salle.class, key);
		return p;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Salle update(Salle obj) {
		Salle p = null;
		p = em.merge(obj);
		return p;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Salle obj) {
		em.remove(em.merge(obj));
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteByKey(Integer key) {
		em.remove(em.find(Salle.class, key));
	}

	@Override
	public List<Salle> findAll() {
		Query query = em.createQuery("from Salle p");
		List<Salle> salles = null;
		salles = query.getResultList();
		return salles;
	}

	@Override
	public Salle findByIdWithPersonnes(Integer key) {
		return null;
	}

}

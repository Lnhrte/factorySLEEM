package sopra.formation.formationSpringBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sopra.projet.factorySleem.model.Ordinateur;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Repository
class DaoOrdinateurJpaImpl implements DaoOrdinateur {

	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void create(Ordinateur obj) {
		em.persist(obj);
	}

	@Override
	public Ordinateur findByKey(String key) {
		Ordinateur p = null;
		p = em.find(Ordinateur.class, key);
		return p;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Ordinateur update(Ordinateur obj) {
		Ordinateur p = null;
		p = em.merge(obj);
		return p;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Ordinateur obj) {
		em.remove(em.merge(obj));
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteByKey(String key) {
		em.remove(em.find(Ordinateur.class, key));
	}

	@Override
	public List<Ordinateur> findAll() {
		Query query = em.createQuery("from Ordinateur p");
		List<Ordinateur> ordinateur = null;
		ordinateur = query.getResultList();
		return ordinateur;
	}

}

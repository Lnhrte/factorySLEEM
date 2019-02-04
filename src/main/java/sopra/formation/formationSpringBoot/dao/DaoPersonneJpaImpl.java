package sopra.formation.formationSpringBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sopra.projet.factorySleem.model.Formateur;
import sopra.projet.factorySleem.model.Personne;
import sopra.projet.factorySleem.model.Stagiaire;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
class DaoPersonneJpaImpl implements DaoPersonne {

	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void create(Personne obj) {
		em.persist(obj);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Personne findByKey(Integer key) {
		Personne p = null;
		p = em.find(Personne.class, key);
		return p;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Personne update(Personne obj) {
		Personne p = null;
		p = em.merge(obj);
		return p;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Personne obj) {
		em.remove(em.merge(obj));
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteByKey(Integer key) {
		em.remove(em.find(Personne.class, key));
	}

	@Override
	public List<Personne> findAll() {
		Query query = em.createQuery("from Personne p");
		List<Personne> personnes = null;
		personnes = query.getResultList();
		return personnes;
	}

	@Override
	public List<Formateur> findAllFormateur() {
		Query query = em.createQuery("from Formateur f");
		List<Formateur> formateurs = null;
		formateurs = query.getResultList();
		return formateurs;
	}

	@Override
	public List<Stagiaire> findAllStagiaire() {
		Query query = em.createQuery("from Stagiaire s");
		List<Stagiaire> stagiaire = null;
		stagiaire = query.getResultList();
		return stagiaire;
	}

}

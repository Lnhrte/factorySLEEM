package sopra.formation.formationSpringBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sopra.projet.factorySleem.model.FormateurMatiere;
import sopra.projet.factorySleem.model.FormateurMatiereKey;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
class DaoFormateurMatiereJpaImpl implements DaoFormateurMatiere {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void create(FormateurMatiere obj) {
		em.persist(obj);
	}

	@Override
	public FormateurMatiere findByKey(FormateurMatiereKey key) {
		FormateurMatiere f = null;
		f = em.find(FormateurMatiere.class, key);
		return f;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public FormateurMatiere update(FormateurMatiere obj) {
		FormateurMatiere f = null;
		f = em.merge(obj);
		return f;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(FormateurMatiere obj) {
		em.remove(em.merge(obj));
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteByKey(FormateurMatiereKey key) {
		em.remove(em.find(FormateurMatiere.class, key));
	}

	@Override
	public List<FormateurMatiere> findAll() {
		Query query = em.createQuery("from FormateurMatiere p");
		List<FormateurMatiere> formateurMatiere = null;
		formateurMatiere = query.getResultList();
		return formateurMatiere;
	}

}

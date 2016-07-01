package tn.amenBank.projetAmen.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.amenBank.projetAmen.persistence.Affectation;
import tn.amenBank.projetAmen.persistence.Projet;


@Stateless
@LocalBean
public class AffectationCrudService {
	
	@PersistenceContext
	private EntityManager em;
	
	public void ajouter(Affectation affectation){
		em.persist(affectation);
	}
	
	public List<Affectation> recupererAffectationParProjet(Projet projet){
		Query query = em.createQuery("SELECT d from Affectation d where d.projet=:projet ", Affectation.class);
		query.setParameter("projet", projet);
		return query.getResultList();
	}

}

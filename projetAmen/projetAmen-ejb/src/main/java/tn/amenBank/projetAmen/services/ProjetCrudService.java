package tn.amenBank.projetAmen.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.amenBank.projetAmen.persistence.Projet;

@Stateless
@LocalBean
public class ProjetCrudService {

	@PersistenceContext
	private EntityManager em;
	
	public List<Projet> recupererToutProjet(){
		return em.createQuery("select p from Projet p", Projet.class).getResultList();
	}
}

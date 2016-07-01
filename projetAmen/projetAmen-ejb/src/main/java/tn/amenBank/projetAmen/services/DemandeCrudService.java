package tn.amenBank.projetAmen.services;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.amenBank.projetAmen.persistence.Demande;
import tn.amenBank.projetAmen.persistence.Utilisateur;

@Stateless
@LocalBean
public class DemandeCrudService {
	
	@PersistenceContext
	private EntityManager em;
	
	public void ajouter(Demande demande){
		em.persist(demande);
	}
	
	public void modifier(Demande demande){
		em.merge(demande);
	}
	
	public Demande recupererDemandeParId(Integer idDemande){
		return em.find(Demande.class, idDemande);
	}
	
	public List<Demande> recupererToutDemande(){
		return em.createNamedQuery("select d from Demande d", Demande.class).getResultList();
	}
	
	public List<Demande> recupererDemandesParDepartement(String departement){
		Query query = em.createQuery("SELECT d from Demande d where d.departement=:departement ", Demande.class);
		query.setParameter("departement", departement);
		return query.getResultList();
	}
	
	public List<Demande> recupererDemandesParDate(Date dateDemande){
		Query query = em.createQuery("SELECT d from Demande d where d.dateDemande=:dateDemande ", Demande.class);
		query.setParameter("dateDemande", dateDemande);
		return query.getResultList();
	}
	
	public List<Demande> recupererDemandesParUtilisateur(Utilisateur utilisateur){
		Query query = em.createQuery("SELECT d from Demande d where d.utilisateur=:utilisateur ", Demande.class);
		query.setParameter("utilisateur", utilisateur);
		return query.getResultList();
	}

}

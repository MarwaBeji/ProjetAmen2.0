package tn.amenBank.projetAmen.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.amenBank.projetAmen.persistence.Utilisateur;

@Stateless
@LocalBean
public class UtilisateurCrudService {

	@PersistenceContext
	private EntityManager em;
	
	public void modifier( Utilisateur utilisateur){
		em.merge(utilisateur);
	}
	
	public Utilisateur recupererUtilisateurParId(Integer idUtilisateur){
		return em.find(Utilisateur.class, idUtilisateur);
	}
	
	public Utilisateur authentification (String login, String password){
		Query query = em.createQuery("SELECT u from Utilisateur u where u.login=:login and u.password=:password", Utilisateur.class);
		query.setParameter("login", login);
		query.setParameter("password", password);
		return (Utilisateur) query.getSingleResult();
	}
	
	public List<Utilisateur> recupererUtilisateurParDepartement(String departement){
		Query query = em.createQuery("SELECT u from Utilisateur u where u.departement=:departement ", Utilisateur.class);
		query.setParameter("departement", departement);
		return query.getResultList();
	}
	
	public List<Utilisateur> recupererUtilisateurParPoste(String poste){
		Query query = em.createQuery("SELECT u from Utilisateur u where u.poste=:poste ", Utilisateur.class);
		query.setParameter("poste", poste);
		return query.getResultList();
	}
	
}

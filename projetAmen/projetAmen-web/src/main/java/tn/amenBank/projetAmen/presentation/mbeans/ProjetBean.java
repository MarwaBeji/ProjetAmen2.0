package tn.amenBank.projetAmen.presentation.mbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import tn.amenBank.projetAmen.persistence.Affectation;
import tn.amenBank.projetAmen.persistence.AffectationPK;
import tn.amenBank.projetAmen.persistence.Projet;
import tn.amenBank.projetAmen.persistence.Utilisateur;
import tn.amenBank.projetAmen.services.AffectationCrudService;
import tn.amenBank.projetAmen.services.ProjetCrudService;
import tn.amenBank.projetAmen.services.UtilisateurCrudService;

@SessionScoped
@ManagedBean(name = "projetB")
public class ProjetBean {

	
	@EJB
	private ProjetCrudService projetService;
	
	@EJB
	private UtilisateurCrudService userService;
	
	@EJB
	private AffectationCrudService affService;
	
	private List<Projet> projets;
	
	private List<Utilisateur> utilisateurs;
	
	private Projet projet=new Projet();
	
	private Boolean showDev;
	
	@PostConstruct
	public void init() {
		projets = projetService.recupererToutProjet();
		utilisateurs= userService.recupererUtilisateurParPoste("developpeur");
	}
	
	public String doAffecterDev(Utilisateur u){
		AffectationPK pk = new AffectationPK();
		pk.setIdProjet(projet.getIdProjet());
		pk.setIdUtilisateur(u.getIdUtilisateur());
		Affectation aff = new Affectation();
		aff.setAffectationPK(pk);
		aff.setProjet(projet);
		aff.setUtilisateur(u);
		affService.ajouter(aff);
		return "dashboardCD?faces-redirect=true";
	}

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Boolean getShowDev() {
		return showDev;
	}

	public void setShowDev(Boolean showDev) {
		this.showDev = showDev;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
}

package tn.amenBank.projetAmen.presentation.mbeans;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import tn.amenBank.projetAmen.persistence.Demande;
import tn.amenBank.projetAmen.services.DemandeCrudService;

@RequestScoped
@ManagedBean(name = "demandeB")
public class DemandeBean {
	
	@EJB
	private DemandeCrudService demandeService;

	private Demande demande = new Demande();

	public String doAjouterDemande(){
		demande.setDateDemande(new Date());
		demandeService.ajouter(demande);
		return "lancementProjet?faces-redirect=true";
	}
	
	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}
	
	
	
}

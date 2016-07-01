package tn.amenBank.projetAmen.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import tn.amenBank.projetAmen.persistence.Utilisateur;

/**
 * Entity implementation class for Entity: Demande
 *
 */
@Entity
@Table(name="t_demande")

public class Demande implements Serializable {

	   
	@Id
	@GeneratedValue
	private Integer idDemande;
	private Date dateDemande;
	private String probleme;
	private String departement;
	private String description;
	@ManyToOne
	private Utilisateur utilisateur;
	private static final long serialVersionUID = 1L;

	public Demande() {
		super();
	}   
	public Integer getIdDemande() {
		return this.idDemande;
	}

	public void setIdDemande(Integer idDemande) {
		this.idDemande = idDemande;
	}   
	public Date getDateDemande() {
		return this.dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}   
	public String getProbleme() {
		return this.probleme;
	}

	public void setProbleme(String probleme) {
		this.probleme = probleme;
	}   
	public String getDepartement() {
		return this.departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
   
}

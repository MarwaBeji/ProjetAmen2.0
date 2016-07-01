package tn.amenBank.projetAmen.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Projet
 *
 */
@Entity
@Table(name="t_projet")

public class Projet implements Serializable {

	   
	@Id
	private Integer idProjet;
	private String titre;
	private String description;
	private String departement;
	private String dateDebut;
	private String dateFin;
	private String etape;
	@OneToMany(mappedBy="projet")
	private List<Document> documents;
	@OneToMany(mappedBy="projet")
	private List<Fiche> fiches;
	@OneToMany(mappedBy="projet")
	private List<Affectation> affectations;
	private static final long serialVersionUID = 1L;

	public Projet() {
		super();
	}   
	public Integer getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}   
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getDepartement() {
		return this.departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}   
	public String getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}   
	public String getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public String getEtape() {
		return etape;
	}
	public void setEtape(String etape) {
		this.etape = etape;
	}
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public List<Fiche> getFiches() {
		return fiches;
	}
	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}
   
}

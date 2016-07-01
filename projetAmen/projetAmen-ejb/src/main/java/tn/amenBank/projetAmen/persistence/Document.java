package tn.amenBank.projetAmen.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Document
 *
 */
@Entity
@Table(name="t_document")

public class Document implements Serializable {

	   
	@Id
	@GeneratedValue
	private Integer idDocument;
	private String nomDocument;
	private String urlDocument;
	private String typeDocument;
	private String etape;
	private Integer etat;
	
	@ManyToOne
	private Projet projet;
	private static final long serialVersionUID = 1L;

	public Document() {
		super();
	}   
	public Integer getIdDocument() {
		return this.idDocument;
	}

	public void setIdDocument(Integer idDocument) {
		this.idDocument = idDocument;
	}   
	public String getNomDocument() {
		return this.nomDocument;
	}

	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}   
	public String getUrlDocument() {
		return this.urlDocument;
	}

	public void setUrlDocument(String urlDocument) {
		this.urlDocument = urlDocument;
	}   
	public String getTypeDocument() {
		return this.typeDocument;
	}

	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}   
	public String getEtape() {
		return etape;
	}
	public void setEtape(String etape) {
		this.etape = etape;
	}
	public Integer getEtat() {
		return this.etat;
	}
	
	public String getEtatString(){
		if (etat==0)
			return "Refusé";
		if(etat==1)
			return "Validé";
		return "En attente";
	}

	public void setEtat(Integer etat) {
		this.etat = etat;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
   
}

package tn.amenBank.projetAmen.persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="validation")
public class FicheValidation extends Fiche{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commentaire;
	private Integer validation;
	
	public FicheValidation() {
		super();
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Integer getValidation() {
		return validation;
	}

	public void setValidation(Integer validation) {
		this.validation = validation;
	}
	
	
	
}

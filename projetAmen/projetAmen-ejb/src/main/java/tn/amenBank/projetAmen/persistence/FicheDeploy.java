package tn.amenBank.projetAmen.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FicheDeploy
 *
 */
@Entity
@DiscriminatorValue(value="deploy")
public class FicheDeploy extends Fiche implements Serializable {

	
	private Date dateDeploy;
	private String commentaire;
	private static final long serialVersionUID = 1L;

	public FicheDeploy() {
		super();
	}   
	public Date getDateDeploy() {
		return this.dateDeploy;
	}

	public void setDateDeploy(Date dateDeploy) {
		this.dateDeploy = dateDeploy;
	}   
	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
   
}

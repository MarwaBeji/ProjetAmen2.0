package tn.amenBank.projetAmen.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Affectation
 *
 */
@Entity
@Table(name="t_affectation")
public class Affectation implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AffectationPK affectationPK;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName = "idProjet", name = "idProjet", updatable = false, insertable = false)
	private Projet projet;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName = "idUtilisateur", name= "idUtilisateur", updatable = false, insertable= false)
	private Utilisateur utilisateur;
	
	
	public Affectation() {
		super();
	}


	public AffectationPK getAffectationPK() {
		return affectationPK;
	}


	public void setAffectationPK(AffectationPK affectationPK) {
		this.affectationPK = affectationPK;
	}


	public Projet getProjet() {
		return projet;
	}


	public void setProjet(Projet projet) {
		this.projet = projet;
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
   
}

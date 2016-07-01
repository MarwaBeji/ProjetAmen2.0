package tn.amenBank.projetAmen.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Fiche
 *
 */
@Entity
@Table(name="t_fiche")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DTYPE")
public class Fiche implements Serializable {

	   
	@Id
	private Integer idFiche;
	private Date dateFiche;
	@ManyToOne
	private Projet projet;
	private static final long serialVersionUID = 1L;

	public Fiche() {
		super();
	}   
	public Integer getIdFiche() {
		return this.idFiche;
	}

	public void setIdFiche(Integer idFiche) {
		this.idFiche = idFiche;
	}   
	public Date getDateFiche() {
		return this.dateFiche;
	}

	public void setDateFiche(Date dateFiche) {
		this.dateFiche = dateFiche;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
   
}

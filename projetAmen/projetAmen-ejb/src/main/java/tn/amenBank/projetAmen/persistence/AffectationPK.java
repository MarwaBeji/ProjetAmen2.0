package tn.amenBank.projetAmen.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AffectationPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idProjet;
	private Integer idUtilisateur;
	
	public AffectationPK() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProjet == null) ? 0 : idProjet.hashCode());
		result = prime * result + ((idUtilisateur == null) ? 0 : idUtilisateur.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AffectationPK other = (AffectationPK) obj;
		if (idProjet == null) {
			if (other.idProjet != null)
				return false;
		} else if (!idProjet.equals(other.idProjet))
			return false;
		if (idUtilisateur == null) {
			if (other.idUtilisateur != null)
				return false;
		} else if (!idUtilisateur.equals(other.idUtilisateur))
			return false;
		return true;
	}
	
	

}

package tn.amenBank.projetAmen.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: FicheTest
 *
 */
@Entity
@DiscriminatorValue(value="test")
public class FicheTest extends Fiche implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String typeTest;
	private Date dateTest;
	private String fichierTeste;
	private String description;
	private String notes;
	
	public FicheTest() {
		super();
	}

	public String getTypeTest() {
		return typeTest;
	}

	public void setTypeTest(String typeTest) {
		this.typeTest = typeTest;
	}

	public Date getDateTest() {
		return dateTest;
	}

	public void setDateTest(Date dateTest) {
		this.dateTest = dateTest;
	}

	public String getFichierTeste() {
		return fichierTeste;
	}

	public void setFichierTeste(String fichierTeste) {
		this.fichierTeste = fichierTeste;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
   
}

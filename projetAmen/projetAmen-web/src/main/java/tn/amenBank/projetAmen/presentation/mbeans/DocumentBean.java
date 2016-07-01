package tn.amenBank.projetAmen.presentation.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.UploadedFile;

@RequestScoped
@ManagedBean(name = "documentB")
public class DocumentBean {

	private UploadedFile file;

	private String nomDocument;
	
	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public String getNomDocument() {
		return nomDocument;
	}

	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}
	
	
	
}

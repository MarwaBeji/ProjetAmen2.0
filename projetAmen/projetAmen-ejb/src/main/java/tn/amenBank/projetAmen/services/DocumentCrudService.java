package tn.amenBank.projetAmen.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.amenBank.projetAmen.persistence.Document;

@Stateless
@LocalBean
public class DocumentCrudService {

	@PersistenceContext
	private EntityManager em;
	
	public void ajouter (Document document){
		em.persist(document);
	}
	
	public void modifier (Document document){
		em.merge(document);
	}
	
	public Document recuprerDocumentParId( Integer idDocument){
		return em.find(Document.class, idDocument);
	}
	
	public List<Document> recupererToutDocument(){
		return em.createQuery("select d from Document d", Document.class).getResultList();
	}
}

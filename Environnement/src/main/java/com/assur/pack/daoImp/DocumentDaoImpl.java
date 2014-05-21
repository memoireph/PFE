package com.assur.pack.daoImp;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.dao.DocumentDao;
import com.assur.pack.dao.SinistreDao;
import com.assur.pack.data.Document_sinist;
import com.assur.pack.data.Sinistre;
import com.assur.pack.dataDTO.DocumentDTO;

@Transactional

public class DocumentDaoImpl implements DocumentDao{
	@PersistenceContext
    EntityManager em;
	private SinistreDao sinistredao;
	@Override
	public void updateDocument(Document_sinist D) {
		em.merge(D);
	}

	@Override
	public void deleteDocument(Long num_doc) {
		Document_sinist D=getDocumentById(num_doc);
		em.remove(D);
	}

	@Override
	public Document_sinist getDocumentById(Long num_doc) {
		return em.find(Document_sinist.class, num_doc);

	}

	@Override
	public Long AddDocument(Document_sinist doc) {
		em.persist(doc);
		return doc.getNum_doc();
		

	}

	@Override
	public DocumentDTO getDocumentDTO(Document_sinist d) {
		DocumentDTO dDTO=new DocumentDTO();
		dDTO.setLibelle(d.getLibelle());
		dDTO.setNum_doc(d.getNum_doc());
		dDTO.setType(d.getType());
		dDTO.setSinistreid(d.getSinistre().getId_sinistre());
		return dDTO;
	}

	@Override
	public Document_sinist createBeanDocument(DocumentDTO dDTO) {
		Document_sinist d=new Document_sinist();
		d.setLibelle(dDTO.getLibelle());
		d.setNum_doc(dDTO.getNum_doc());
		d.setType(dDTO.getType());
		d.setSinistre(sinistredao.getSinistreById(dDTO.getSinistreid()));
		return d;
	}
	
	
}

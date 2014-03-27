package com.assur.pack.daoImp;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.assur.pack.dao.DocumentDao;
import com.assur.pack.data.Document_sinist;

public class DocumentDaoImpl implements DocumentDao {
	@PersistenceContext
    EntityManager em;
	@Override
	public void addDocument(Document_sinist D, Long id_sinistre) {
		

	}

	@Override
	public void updateDocument(Document_sinist D) {
		

	}

	@Override
	public void deleteDocument(Long num_doc) {
		

	}

	@Override
	public void getDocumentById(Long num_doc) {
		// TODO Auto-generated method stub

	}


}

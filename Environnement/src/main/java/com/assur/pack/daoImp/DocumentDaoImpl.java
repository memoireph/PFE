package com.assur.pack.daoImp;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.dao.DocumentDao;
import com.assur.pack.data.Document_sinist;
import com.assur.pack.data.Sinistre;
<<<<<<< HEAD
@Transactional
=======

>>>>>>> branch 'master' of ssh://git@github.com/memoireph/PFE.git
public class DocumentDaoImpl implements DocumentDao{
	@PersistenceContext
    EntityManager em;

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
<<<<<<< HEAD
	}

	@Override
	public Long AddDocument(Document_sinist doc) {
		em.persist(doc);
		return doc.getNum_doc();
		
=======
>>>>>>> branch 'master' of ssh://git@github.com/memoireph/PFE.git
	}


}

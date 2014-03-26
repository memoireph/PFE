package com.assur.pack.dao;

import com.assur.pack.data.Document_sinist;

public interface DocumentDao {
	
	public void addDocument(Document_sinist D, Long id_sinistre);
	public void updateDocument(Document_sinist D);
	public void deleteDocument(Long num_doc);
	public void getDocumentById(Long num_doc);
	

}

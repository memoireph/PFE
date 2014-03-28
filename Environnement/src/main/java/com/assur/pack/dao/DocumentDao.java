package com.assur.pack.dao;

import com.assur.pack.data.Document_sinist;

public interface DocumentDao {
	public Long AddDocument(Document_sinist doc);
	public void updateDocument(Document_sinist D);
	public void deleteDocument(Long num_doc);
	public Document_sinist getDocumentById(Long num_doc);
	

}

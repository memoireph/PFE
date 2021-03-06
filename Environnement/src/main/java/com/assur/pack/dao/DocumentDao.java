package com.assur.pack.dao;

import com.assur.pack.data.Document_sinist;
import com.assur.pack.dataDTO.DocumentDTO;

public interface DocumentDao {

	public Long AddDocument(Document_sinist doc);

	public void updateDocument(Document_sinist D);
	public void deleteDocument(Long num_doc);
	public Document_sinist getDocumentById(Long num_doc);

	DocumentDTO getDocumentDTO(Document_sinist d);

	Document_sinist createBeanDocument(DocumentDTO dDTO);
	

}

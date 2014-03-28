package com.assur.pack.daoImpTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assur.pack.dao.DocumentDao;
import com.assur.pack.dao.SinistreDao;
import com.assur.pack.data.Document_sinist;

public class TestDocumentDaoImpl {
	   private static DocumentDao documentdaoImp;
	    private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		documentdaoImp=(DocumentDao)context.getBean("documentdao");
	}

	@Test
	public void testAddDocument() {
		Document_sinist doc=new Document_sinist("libelle","tyoe",null);
		assertNotNull(documentdaoImp.AddDocument(doc));
	}

	@Test
	public void testUpdateDocument() {
		Document_sinist doc=documentdaoImp.getDocumentById(new Long(1));
		doc.setLibelle("libelle à jour");
		documentdaoImp.updateDocument(doc);
	}

	@Test
	public void testDeleteDocument() {
		
	}

	@Test
	public void testGetDocumentById() {
		assertNotNull(documentdaoImp.getDocumentById(new Long(1)));
	}

}

package com.assur.pack.daoImpTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assur.pack.dao.EtatDao;
import com.assur.pack.dao.SinistreDao;
import com.assur.pack.data.Etat;

public class TestEtatDaoImpl {
	 private static EtatDao etatdao;
	    private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		etatdao=(EtatDao)context.getBean("etatdao");
	}

	

	@Test
	public void testUpdateEtat() {
		Etat etat=etatdao.getEtatById(new Long(1));
		etat.setIntitule("en cours");
	}

	@Test
	public void testDeleteEtat() {
		
		etatdao.deleteEtat(new Long(1));
	}

	@Test
	public void testGetEtatById() {
		assertNotNull(etatdao.getEtatById(new Long(1)));
	}

}

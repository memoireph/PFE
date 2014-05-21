package com.assur.pack.daoImpTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assur.pack.dao.RapportDao;
import com.assur.pack.data.Avis;
import com.assur.pack.data.Rapport;
import com.assur.pack.data.Rapport_expert;

public class TestRapportDaoImpl {
	private static RapportDao rapportdao;
	private static ClassPathXmlApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	context =new ClassPathXmlApplicationContext("applicationContext.xml");
	rapportdao=(RapportDao)context.getBean("rapportdao");
	}

	@Test
	public void testAddRapport() {
		Rapport rapport=new Rapport_expert(2, "cause", "etat avant", "etat apres", null);
		Rapport rapport2=new Avis("avis", "destination", null);
		
	}

	@Test
	public void testUpdateRapport() {
	
		
	}

	@Test
	public void testDeleteRapport() {
		
	}

	@Test
	public void testGetRapportById() {
		fail("Not yet implemented");
	}

}

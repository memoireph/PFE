package com.assur.pack.daoImpTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.dao.SinistreDao;
import com.assur.pack.daoImp.SinistreDaoImpl;
import com.assur.pack.data.Etat;
import com.assur.pack.data.Sinistre;
import com.assur.pack.dataDTO.SinistreDTO;


public class SinistreDaoImpTest {
    private static SinistreDao sinistredao;
    private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	context=new ClassPathXmlApplicationContext("applicationContext.xml");
	sinistredao=(SinistreDao)context.getBean("sinistredaoregleur");
		
	}

	
	@Test
	public void testAddSinistre(){
		
		Sinistre sinistre=new Sinistre("mode gestion","regleur",new Date(),"lieu sinistre", new Date(), new Date(),"statu","urgent",10.0,null,null,null,null,null,null,null);
		assertNotNull(sinistredao.addSinistre(sinistre));
		
		
	}
	
	@Test
	public void testGetSinistreById(){
		assertNotNull(sinistredao.getSinistreById(new Long(1)));
	}
	
	@Test
	public void testUpdateSinistre(){
		Sinistre sinistre=sinistredao.getSinistreById(new Long(1));
		sinistre.setMode_gestion("gestion_mode");
		sinistredao.updateSinistre(sinistre);
		
	}
	
	@Test 
	public void testAddEtat(){
		
		Etat etat=new Etat("declaration",new Date(),new Date(),true,null,null);
		sinistredao.addEtat(etat,new Long(1));
	}

	@Test 
	public void testDTO(){
		Sinistre sinistre=sinistredao.getSinistreById(new Long(1));
		SinistreDTO sdto=sinistredao.createBean(sinistre);
		assertNotNull(sdto);
		assertNotNull(sinistredao.createSinistre(sdto));
	}
	
	@Test
	public void testGetAllSinistre(){
		assertNotNull(sinistredao.listSinistre());
		
	}
}

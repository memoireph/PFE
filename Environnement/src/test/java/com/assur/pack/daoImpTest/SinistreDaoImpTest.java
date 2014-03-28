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
import com.assur.pack.data.Sinistre;


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
		
	}
	
	@Test
	public void testUpdateSinistre(){
		
		
	}
	

	
}

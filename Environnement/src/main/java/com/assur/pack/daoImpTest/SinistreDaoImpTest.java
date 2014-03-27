package com.assur.pack.daoImpTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.assur.pack.daoImp.SinistreDaoImpl;
import com.assur.pack.data.Sinistre;

@Transactional
public class SinistreDaoImpTest {
    private static SinistreDaoImpl sinistredao;
    private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	context=new ClassPathXmlApplicationContext("applicationContext.xml");
	sinistredao=(SinistreDaoImpl)context.getBean("sinistredaoregleur");
		
	}

	
	@Test
	public void testAddSinistre(){
		
		Sinistre sinistre=new Sinistre("mode gestion","regleur",new Date(),"lieu sinistre", new Date(), new Date(),"statu","urgent",10.0,null,null,null,null,null,null,null);
		//assertNotNull(sinistredao.addSinistre(sinistre));
		try{
		sinistredao.addSinistre(sinistre);
		}
		catch(Exception ex){
			fail(ex.getMessage());
		}
		
	}

	
}

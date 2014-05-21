package com.assur.pack.daoImpTest;

import static org.junit.Assert.*;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.assur.pack.dao.SinistreDao;
import com.assur.pack.data.Sinistre;


public class SinistreDaoImpTestt {
	@Test
	public void testAddSinistre(){
		try{
		ClassPathXmlApplicationContext app= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		SinistreDao sinistredao = (SinistreDao)app.getBean("sinistredaoregleur");
		List<Sinistre> sin=sinistredao.listSinistre();
		/*
		sinistredao.addSinistre(new Sinistre("mode gestion1","regleur",new Date(),"lieu sinistre", new Date(), new Date(),"statu","urgent",10.0,null,null,null,null,null,null,null));
		sinistredao.addSinistre(new Sinistre("mode gestion2","regleur",new Date(),"lieu sinistre", new Date(), new Date(),"statu","urgent",10.0,null,null,null,null,null,null,null));
		*/
		List<Sinistre> sin2=sinistredao.listSinistre();
		assertTrue(sin.size()+2==sin2.size());
		}
		catch (Exception e){
			assertTrue(e.getMessage(),false);
		}
		
	}

	
}

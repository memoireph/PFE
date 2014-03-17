package com.assur.pack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class laghrissiTest {

	@Test
	public void test() {
		try{
		ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		assertTrue("effectué avec succes",true);
		}
		catch(Exception e){
			assertTrue(e.getMessage(),false);
		}
		
	}

}

package com.assur.pack.data;

import javax.persistence.Entity;

@Entity
public class Compagnie extends Intervenant {
    
	protected String patente;
	protected String site;
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
}

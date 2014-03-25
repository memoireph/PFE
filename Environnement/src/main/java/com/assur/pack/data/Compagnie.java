package com.assur.pack.data;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Compagnie extends Intervenant {
    
	@NotEmpty
	private String patente;
	private String site;
	
	
	
	public Compagnie() {
		super();
	}
	public Compagnie(String patente, String site) {
		super();
		this.patente = patente;
		this.site = site;
	}
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

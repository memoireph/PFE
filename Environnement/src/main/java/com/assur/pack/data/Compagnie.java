package com.assur.pack.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Compagnie extends Intervenant {
    
	@NotEmpty
	private String patente;
	private String site;
	@OneToMany(mappedBy="compagnie")
	private List<Personel> personnels;
	
	
	public List<Personel> getPersonnels() {
		return personnels;
	}
	public void setPersonnels(List<Personel> personnels) {
		this.personnels = personnels;
	}
	public Compagnie() {
		super();
	}
	public Compagnie(String patente, String site) {
		super();
		this.patente = patente;
		this.site = site;
	}
	
	public Compagnie(String nom_intr, String email_intr,
			List<Telephones> telephones, List<Domiciles> domiciles,
			List<Activites> activites, List<Liens> liens, List<Tiers> tiers,
			List<Sinistre> sinistre, String patente, String site) {
		super(nom_intr, email_intr, telephones, domiciles, activites, liens,
				tiers, sinistre);
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

package com.assur.pack.data;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Activites implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_acti;
	private String activite;
	private String profession;
	private String fonction;
	private String etat;

	
	
	public Activites() {
		super();
	}

	public Activites(String activite, String profession, String fonction,
			String etat) {
		super();
		this.activite = activite;
		this.profession = profession;
		this.fonction = fonction;
		this.etat = etat;
		
	}

	public Long getId_acti() {
		return id_acti;
	}

	public void setId_acti(Long id_acti) {
		this.id_acti = id_acti;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}



	
	
	
}

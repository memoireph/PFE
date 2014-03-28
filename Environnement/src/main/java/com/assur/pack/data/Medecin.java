package com.assur.pack.data;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Medecin extends Intervenant {
      @NotEmpty
	private String prenom;

      
	public Medecin() {
		super();
	}

	public Medecin(String prenom) {
		super();
		this.prenom = prenom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
     
      
}

package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Rapport_expert extends Rapport {
     
	 private int ITT;
	 private String cause;
	 private String etat_avant;
	 private String blessure;
	 
	 @NotEmpty
	 @Lob
		private byte[] fichier;
		private String type;
		private Long taille;
	 @ManyToOne
	 private Medecin medecin;
	 
	 
	public Rapport_expert() {
		super();
	}

	public Rapport_expert(int iTT, String cause, String etat_avant,
			String blessure, Medecin medecin) {
		super();
		ITT = iTT;
		this.cause = cause;
		this.etat_avant = etat_avant;
		this.blessure = blessure;
		this.medecin = medecin;
	}

	public int getITT() {
		return ITT;
	}

	public void setITT(int iTT) {
		ITT = iTT;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getEtat_avant() {
		return etat_avant;
	}

	public void setEtat_avant(String etat_avant) {
		this.etat_avant = etat_avant;
	}

	public String getBlessure() {
		return blessure;
	}

	public void setBlessure(String blessure) {
		this.blessure = blessure;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public byte[] getFichier() {
		return fichier;
	}

	public void setFichier(byte[] fichier) {
		this.fichier = fichier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTaille() {
		return taille;
	}

	public void setTaille(Long taille) {
		this.taille = taille;
	}
	 
	 
}

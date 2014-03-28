package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Rapport_expert extends Rapport {
     
	 private int ITT;
	 private String cause;
	 private String etat_avant;
	 private String blessure;
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
	 
	 
}

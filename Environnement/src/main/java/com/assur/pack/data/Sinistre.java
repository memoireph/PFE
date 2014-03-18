package com.assur.pack.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Sinistre implements Serializable{
     private Long id_sinistre;
     private String type_sinistre;
     private Date date_sinistre;
     private String lieu_sinistre;
     private Date date_decla;
     private Date date_cloture;
     private int qualification;
     private List<Intervenant> intrervenant;
     private List<Etat> etat_sinistre;
     private List<Document_sinist> doc_sinistre;
     private Indemnisation indemnisation;
     
     
     
	public Sinistre() {
		super();
	}
	public Sinistre(String type_sinistre, Date date_sinistre,
			String lieu_sinistre, Date date_decla, Date date_cloture,
			int qualification, List<Intervenant> intrervenant,
			List<Etat> etat_sinistre, List<Document_sinist> doc_sinistre,
			Indemnisation indemnisation) {
		super();
		this.type_sinistre = type_sinistre;
		this.date_sinistre = date_sinistre;
		this.lieu_sinistre = lieu_sinistre;
		this.date_decla = date_decla;
		this.date_cloture = date_cloture;
		this.qualification = qualification;
		this.intrervenant = intrervenant;
		this.etat_sinistre = etat_sinistre;
		this.doc_sinistre = doc_sinistre;
		this.indemnisation = indemnisation;
	}
	public Long getId_sinistre() {
		return id_sinistre;
	}
	public void setId_sinistre(Long id_sinistre) {
		this.id_sinistre = id_sinistre;
	}
	public String getType_sinistre() {
		return type_sinistre;
	}
	public void setType_sinistre(String type_sinistre) {
		this.type_sinistre = type_sinistre;
	}
	public Date getDate_sinistre() {
		return date_sinistre;
	}
	public void setDate_sinistre(Date date_sinistre) {
		this.date_sinistre = date_sinistre;
	}
	public String getLieu_sinistre() {
		return lieu_sinistre;
	}
	public void setLieu_sinistre(String lieu_sinistre) {
		this.lieu_sinistre = lieu_sinistre;
	}
	public Date getDate_decla() {
		return date_decla;
	}
	public void setDate_decla(Date date_decla) {
		this.date_decla = date_decla;
	}
	public Date getDate_cloture() {
		return date_cloture;
	}
	public void setDate_cloture(Date date_cloture) {
		this.date_cloture = date_cloture;
	}
	public int getQualification() {
		return qualification;
	}
	public void setQualification(int qualification) {
		this.qualification = qualification;
	}
	public List<Intervenant> getIntrervenant() {
		return intrervenant;
	}
	public void setIntrervenant(List<Intervenant> intrervenant) {
		this.intrervenant = intrervenant;
	}
	public List<Etat> getEtat_sinistre() {
		return etat_sinistre;
	}
	public void setEtat_sinistre(List<Etat> etat_sinistre) {
		this.etat_sinistre = etat_sinistre;
	}
	public List<Document_sinist> getDoc_sinistre() {
		return doc_sinistre;
	}
	public void setDoc_sinistre(List<Document_sinist> doc_sinistre) {
		this.doc_sinistre = doc_sinistre;
	}
	public Indemnisation getIndemnisation() {
		return indemnisation;
	}
	public void setIndemnisation(Indemnisation indemnisation) {
		this.indemnisation = indemnisation;
	}
     
     
}

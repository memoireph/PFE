package com.assur.pack.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class SinistreH implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_histo;
	public Long getId_histo() {
		return id_histo;
	}

	public void setId_histo(Long id_histo) {
		this.id_histo = id_histo;
	}

	@Temporal(TemporalType.DATE)
     private Date date_historique;
	 
	 private String modifie_par;
	
    private String mode_gestion;
	
     private String type_sinistre;
	@Temporal(TemporalType.DATE)
     private Date date_sinistre;

     private String lieu_sinistre;
	@Temporal(TemporalType.DATE)
     private Date date_decla;
	@Temporal(TemporalType.DATE)
     private Date date_cloture;
	 private String statut;
     private String qualification;
     private Double reserve;
     private Long id_sinistre;
	//private Sinistre sinistre;
   
     
     
	public Long getId_sinistre() {
		return id_sinistre;
	}

	public void setId_sinistre(Long id_sinistre) {
		this.id_sinistre = id_sinistre;
	}

	public SinistreH() {
		super();
	}

	public SinistreH(Date date_historique, String modifie_par,
			String mode_gestion, String type_sinistre, Date date_sinistre,
			String lieu_sinistre, Date date_decla, Date date_cloture,
			String statut, String qualification, Double reserve) {
		super();
		this.date_historique = date_historique;
		this.modifie_par = modifie_par;
		this.mode_gestion = mode_gestion;
		this.type_sinistre = type_sinistre;
		this.date_sinistre = date_sinistre;
		this.lieu_sinistre = lieu_sinistre;
		this.date_decla = date_decla;
		this.date_cloture = date_cloture;
		this.statut = statut;
		this.qualification = qualification;
		this.reserve = reserve;
		
	}

	public Date getDate_historique() {
		return date_historique;
	}

	public void setDate_historique(Date date_historique) {
		this.date_historique = date_historique;
	}

	public String getModifie_par() {
		return modifie_par;
	}

	public void setModifie_par(String modifie_par) {
		this.modifie_par = modifie_par;
	}

	public String getMode_gestion() {
		return mode_gestion;
	}

	public void setMode_gestion(String mode_gestion) {
		this.mode_gestion = mode_gestion;
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

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Double getReserve() {
		return reserve;
	}

	public void setReserve(Double reserve) {
		this.reserve = reserve;
	}
	/*
	public void setSinistre(Sinistre sinistre) {
		this.sinistre = sinistre;
	}
	
   */  
     

}

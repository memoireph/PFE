package com.assur.pack.data;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Liens {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_lien;
	@NotEmpty
	private String descreption;
	private String type_lien;
	@Temporal(TemporalType.DATE)
	private Date date_debut;
	@Temporal(TemporalType.DATE)
	private Date date_fin;
	
	
	
	public Liens() {
		super();
	}

	public Liens(String descreption, String type_lien, Date date_debut,
			Date date_fin) {
		super();
		this.descreption = descreption;
		this.type_lien = type_lien;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	
	}

	public Long getId_lien() {
		return id_lien;
	}

	public void setId_lien(Long id_lien) {
		this.id_lien = id_lien;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

	public String getType_lien() {
		return type_lien;
	}

	public void setType_lien(String type_lien) {
		this.type_lien = type_lien;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	
	
	
}

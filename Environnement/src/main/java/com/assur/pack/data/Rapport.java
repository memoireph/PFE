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
public class Rapport implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id_rapport;
	@Temporal(TemporalType.DATE)
	protected Date date_creation;
	protected String intitule;
	protected String nomdoc;
	protected String description;
	@ManyToOne
	private Sinistre sinistre;
	
	public Rapport() {
		super();
	}

	public Rapport(Date date_creation, String intitule, String nomdoc,
			String description, Sinistre sinistre) {
		super();
		this.date_creation = date_creation;
		this.intitule = intitule;
		this.nomdoc = nomdoc;
		this.description = description;
		this.sinistre = sinistre;
	}

	public Long getId_rapport() {
		return id_rapport;
	}

	public void setId_rapport(Long id_rapport) {
		this.id_rapport = id_rapport;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getNomdoc() {
		return nomdoc;
	}

	public void setNomdoc(String nomdoc) {
		this.nomdoc = nomdoc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Sinistre getSinistre() {
		return sinistre;
	}

	public void setSinistre(Sinistre sinistre) {
		this.sinistre = sinistre;
	}
	
	
	
	
	
}

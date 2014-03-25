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
public class Etat implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_etat;
	@NotEmpty
	private String intitule;
	@Temporal(TemporalType.DATE)
	private Date date_realisation;
	@Temporal(TemporalType.DATE)
	private Date echeance;
	private boolean realiser;
	@ManyToOne
	private Intervenant intervenant;
	@ManyToOne
	private Sinistre sinistre;
	
	public Etat() {
		super();
	}

	public Etat(String intitule, Date date_realisation, Date echeance,
			boolean realiser, Intervenant intervenant, Sinistre sinistre) {
		super();
		this.intitule = intitule;
		this.date_realisation = date_realisation;
		this.echeance = echeance;
		this.realiser = realiser;
		this.intervenant = intervenant;
		this.sinistre = sinistre;
	}

	public Long getId_etat() {
		return id_etat;
	}

	public void setId_etat(Long id_etat) {
		this.id_etat = id_etat;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Date getDate_realisation() {
		return date_realisation;
	}

	public void setDate_realisation(Date date_realisation) {
		this.date_realisation = date_realisation;
	}

	public Date getEcheance() {
		return echeance;
	}

	public void setEcheance(Date echeance) {
		this.echeance = echeance;
	}

	public boolean isRealiser() {
		return realiser;
	}

	public void setRealiser(boolean realiser) {
		this.realiser = realiser;
	}

	public Intervenant getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}

	public Sinistre getSinistre() {
		return sinistre;
	}

	public void setSinistre(Sinistre sinistre) {
		this.sinistre = sinistre;
	}
	
	
}

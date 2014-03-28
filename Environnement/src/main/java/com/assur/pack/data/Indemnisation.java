package com.assur.pack.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Indemnisation implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num_ind;
	@Temporal(TemporalType.DATE)
	private Date date_ind;
	@OneToOne
	private Sinistre sinistre;
	@OneToOne
	private Cheque cheque;
	@OneToOne
	private Quittance quittance;
	
	
	public Indemnisation() {
		super();
	}

	public Indemnisation(Date date_ind, Sinistre sinistre, Cheque cheque,
			Quittance quittance) {
		super();
		this.date_ind = date_ind;
		this.sinistre = sinistre;
		this.cheque = cheque;
		this.quittance = quittance;
	}

	public Long getNum_ind() {
		return num_ind;
	}

	public void setNum_ind(Long num_ind) {
		this.num_ind = num_ind;
	}

	public Date getDate_ind() {
		return date_ind;
	}

	public void setDate_ind(Date date_ind) {
		this.date_ind = date_ind;
	}

	public Sinistre getSinistre() {
		return sinistre;
	}

	public void setSinistre(Sinistre sinistre) {
		this.sinistre = sinistre;
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}

	public Quittance getQuittance() {
		return quittance;
	}

	public void setQuittance(Quittance quittance) {
		this.quittance = quittance;
	}
	
	
}

package com.assur.pack.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cheque implements Serializable{
    @Id
	private Long num_cheq;
	@NotEmpty
	private Double montant;
	@OneToOne
	private Indemnisation ind;
	
	public Cheque() {
		super();
	}

	public Cheque(Long num_cheq, Double montant, Indemnisation ind) {
		super();
		this.num_cheq = num_cheq;
		this.montant = montant;
		this.ind = ind;
	}

	public Long getNum_cheq() {
		return num_cheq;
	}

	public void setNum_cheq(Long num_cheq) {
		this.num_cheq = num_cheq;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Indemnisation getInd() {
		return ind;
	}

	public void setInd(Indemnisation ind) {
		this.ind = ind;
	}
	
	
}

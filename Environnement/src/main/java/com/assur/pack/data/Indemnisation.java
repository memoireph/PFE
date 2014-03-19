package com.assur.pack.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Indemnisation {
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
	
}

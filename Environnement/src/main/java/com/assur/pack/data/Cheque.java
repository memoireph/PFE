package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cheque {
    @Id
	private Long num_cheq;
	@NotEmpty
	private Double montant;
	@OneToOne
	private Indemnisation ind;
	
}

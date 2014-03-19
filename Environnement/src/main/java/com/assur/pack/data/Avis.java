package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Avis extends Rapport {
  
	private String ref;
	//@NotEmpty
	private String destination;
	@ManyToOne
	private Personel personel;
}

package com.assur.pack.data;

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
public class Etat {
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
	
}

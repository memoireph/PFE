package com.assur.pack.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Rapport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id_rapport;
	@Temporal(TemporalType.DATE)
	protected Date date_creation;
	@NotEmpty
	protected String intitule;
	@NotEmpty
	protected String nomdoc;
	@NotEmpty
	protected String description;
	
}

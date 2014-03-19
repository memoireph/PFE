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
	@ManyToOne
	private Intervenant intervenant;
	
}

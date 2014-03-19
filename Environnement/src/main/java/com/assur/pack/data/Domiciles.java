package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Domiciles {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_domicile;
	private String type_dom;
	@NotEmpty
	private String adresse_dom;
	@NotEmpty
	private String code_postal;
	@NotEmpty
	private String ville;
	@NotEmpty
	private String pays;
	@ManyToOne
	private Intervenant intervenant;
}

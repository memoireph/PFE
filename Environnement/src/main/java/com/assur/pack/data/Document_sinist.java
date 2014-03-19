package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Document_sinist {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num_doc;
	@NotEmpty
	private String libelle;
	private String type;
	@ManyToOne
	private Sinistre sinistre;
}

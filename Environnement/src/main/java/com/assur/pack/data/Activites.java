package com.assur.pack.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Activites {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_acti;
	private String activite;
	private String profession;
	private String fonction;
	private String etat;
	@ManyToOne
	private Intervenant intervenant;
	
}

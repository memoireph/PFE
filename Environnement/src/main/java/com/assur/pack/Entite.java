package com.assur.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Entite {
	@Id
	private long id;
	@Column
	private String nom;

}

package com.assur.pack.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Garanties implements Serializable{
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_garantie;
	@NotEmpty
	private String libelle_garantie;
	@ManyToOne
	private Contrat contrat;
	
	
	public Garanties() {
		super();
	}

	public Garanties(String libelle_garantie, Contrat contrat) {
		super();
		this.libelle_garantie = libelle_garantie;
		this.contrat = contrat;
	}

	public int getId_garantie() {
		return id_garantie;
	}

	public void setId_garantie(int id_garantie) {
		this.id_garantie = id_garantie;
	}

	public String getLibelle_garantie() {
		return libelle_garantie;
	}

	public void setLibelle_garantie(String libelle_garantie) {
		this.libelle_garantie = libelle_garantie;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	
}

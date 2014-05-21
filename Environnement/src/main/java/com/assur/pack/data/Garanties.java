package com.assur.pack.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;


@Entity
public class Garanties implements Serializable{
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_garantie;
	@NotEmpty
	private String libelle_garantie;
	private String description_garantie;
	@ManyToMany
	private List<Contrat> contrat;
	
	
	public Garanties() {
		super();
	}


	public Garanties(String libelle_garantie, String description_garantie) {
		super();
		this.libelle_garantie = libelle_garantie;
		this.description_garantie = description_garantie;
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

	public List<Contrat> getContrat() {
		return contrat;
	}

	public void setContrat(List<Contrat> contrat) {
		this.contrat = contrat;
	}
	public String getDescription_garantie() {
		return description_garantie;
	}

	public void setDescription_garantie(String description_garantie) {
		this.description_garantie = description_garantie;
	}

	
}

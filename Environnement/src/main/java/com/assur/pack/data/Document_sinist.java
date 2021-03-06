package com.assur.pack.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Document_sinist implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num_doc;
	@NotEmpty
	private String libelle;
	private String type;
	@ManyToOne
	private Sinistre sinistre;
	private String description;
	@NotEmpty
	@Lob
	private byte[] fichier;
	private Long taille;
	public Document_sinist() {
		super();
	}

	public Document_sinist(String libelle, String type, Sinistre sinistre) {
		super();
		this.libelle = libelle;
		this.type = type;
		this.sinistre = sinistre;
	}

	public Long getNum_doc() {
		return num_doc;
	}

	public void setNum_doc(Long num_doc) {
		this.num_doc = num_doc;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Sinistre getSinistre() {
		return sinistre;
	}

	public void setSinistre(Sinistre sinistre) {
		this.sinistre = sinistre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getFichier() {
		return fichier;
	}

	public void setFichier(byte[] fichier) {
		this.fichier = fichier;
	}

	public Long getTaille() {
		return taille;
	}

	public void setTaille(Long taille) {
		this.taille = taille;
	}
	
	
}

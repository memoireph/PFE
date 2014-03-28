package com.assur.pack.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public abstract class Intervenant implements Serializable{
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id_intr;
	@NotEmpty
	protected String nom_intr;
	@NotEmpty
	@Email
	protected String email_intr;
	@OneToMany(mappedBy="intervenant")
	protected List<Telephones> telephones;
	@OneToMany(mappedBy="intervenant")
	protected List<Domiciles> domiciles;
	@OneToMany(mappedBy="intervenant")
	protected List<Activites> activites;
	@OneToMany(mappedBy="intervenant")
	protected List<Liens> liens;
	@OneToMany(mappedBy="intervenant")
	protected List<Tiers> tiers;
	@ManyToMany
	protected List<Sinistre> sinistre;
	
	
	public Intervenant() {
		super();
	}

	public Intervenant(String nom_intr, String email_intr,
			List<Telephones> telephones, List<Domiciles> domiciles,
			List<Activites> activites, List<Liens> liens, List<Tiers> tiers,
			List<Sinistre> sinistre) {
		super();
		this.nom_intr = nom_intr;
		this.email_intr = email_intr;
		this.telephones = telephones;
		this.domiciles = domiciles;
		this.activites = activites;
		this.liens = liens;
		this.tiers = tiers;
		this.sinistre = sinistre;
	}

	public Long getId_intr() {
		return id_intr;
	}

	public void setId_intr(Long id_intr) {
		this.id_intr = id_intr;
	}

	public String getNom_intr() {
		return nom_intr;
	}

	public void setNom_intr(String nom_intr) {
		this.nom_intr = nom_intr;
	}

	public String getEmail_intr() {
		return email_intr;
	}

	public void setEmail_intr(String email_intr) {
		this.email_intr = email_intr;
	}

	public List<Telephones> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Telephones> telephones) {
		this.telephones = telephones;
	}

	public List<Domiciles> getDomiciles() {
		return domiciles;
	}

	public void setDomiciles(List<Domiciles> domiciles) {
		this.domiciles = domiciles;
	}

	public List<Activites> getActivites() {
		return activites;
	}

	public void setActivites(List<Activites> activites) {
		this.activites = activites;
	}

	public List<Liens> getLiens() {
		return liens;
	}

	public void setLiens(List<Liens> liens) {
		this.liens = liens;
	}

	public List<Tiers> getTiers() {
		return tiers;
	}

	public void setTiers(List<Tiers> tiers) {
		this.tiers = tiers;
	}

	public List<Sinistre> getSinistre() {
		return sinistre;
	}

	public void setSinistre(List<Sinistre> sinistre) {
		this.sinistre = sinistre;
	}
	

}

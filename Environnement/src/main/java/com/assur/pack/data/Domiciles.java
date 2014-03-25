package com.assur.pack.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Domiciles implements Serializable {
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
	
	
	public Domiciles() {
		super();
	}

	public Domiciles(String type_dom, String adresse_dom, String code_postal,
			String ville, String pays, Intervenant intervenant) {
		super();
		this.type_dom = type_dom;
		this.adresse_dom = adresse_dom;
		this.code_postal = code_postal;
		this.ville = ville;
		this.pays = pays;
		this.intervenant = intervenant;
	}

	public Long getId_domicile() {
		return id_domicile;
	}

	public void setId_domicile(Long id_domicile) {
		this.id_domicile = id_domicile;
	}

	public String getType_dom() {
		return type_dom;
	}

	public void setType_dom(String type_dom) {
		this.type_dom = type_dom;
	}

	public String getAdresse_dom() {
		return adresse_dom;
	}

	public void setAdresse_dom(String adresse_dom) {
		this.adresse_dom = adresse_dom;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Intervenant getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}
	
	
}

package com.assur.pack.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Medecin extends Intervenant {
	@NotEmpty
	private String prenom;
	@NotEmpty
	private String CIN;
	private String CNSS;
	private String passeport;
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Past
	private Date date_naissance;
	private String civilite;

      
	public Medecin() {
		super();
	}

	
	public Medecin(String prenom, String cIN, String cNSS, String passeport,
			Date date_naissance, String civilite) {
		super();
		this.prenom = prenom;
		CIN = cIN;
		CNSS = cNSS;
		this.passeport = passeport;
		this.date_naissance = date_naissance;
		this.civilite = civilite;
	}



	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getCIN() {
		return CIN;
	}


	public void setCIN(String cIN) {
		CIN = cIN;
	}


	public String getCNSS() {
		return CNSS;
	}


	public void setCNSS(String cNSS) {
		CNSS = cNSS;
	}


	public String getPasseport() {
		return passeport;
	}


	public void setPasseport(String passeport) {
		this.passeport = passeport;
	}


	public Date getDate_naissance() {
		return date_naissance;
	}


	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}


	public String getCivilite() {
		return civilite;
	}


	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}



      
}

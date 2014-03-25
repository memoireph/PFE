package com.assur.pack.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Victime extends Intervenant {
	@NotEmpty
	private String prenom;
	@NotEmpty
	private String CIN;
	private String CNSS;
	private String passeport;
	@Temporal(TemporalType.DATE)
	@Past
	private Date date_naissance;
	@OneToOne
	private Contrat contrat;
	
	public Victime() {
		super();
	}

	public Victime(String prenom, String cIN, String cNSS, String passeport,
			Date date_naissance, Contrat contrat) {
		super();
		this.prenom = prenom;
		CIN = cIN;
		CNSS = cNSS;
		this.passeport = passeport;
		this.date_naissance = date_naissance;
		this.contrat = contrat;
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

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	
	
	
}

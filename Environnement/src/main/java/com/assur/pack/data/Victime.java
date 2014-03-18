package com.assur.pack.data;

import java.util.Date;

public class Victime extends Intervenant {
  
	private Long num_contrat;
	private String prenom;
	private String CIN;
	private String CNSS;
	private String passeport;
	private Date date_naissance;
	
	
	public Victime() {
		super();
	}
	public Victime(Long num_contrat, String prenom, String cIN, String cNSS,
			String passeport, Date date_naissance) {
		super();
		this.num_contrat = num_contrat;
		this.prenom = prenom;
		CIN = cIN;
		CNSS = cNSS;
		this.passeport = passeport;
		this.date_naissance = date_naissance;
	}
	public Long getNum_contrat() {
		return num_contrat;
	}
	public void setNum_contrat(Long num_contrat) {
		this.num_contrat = num_contrat;
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
	
	
	
}

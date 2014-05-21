package com.assur.pack.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Past;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;
import org.hibernate.validator.constraints.NotEmpty;

@Entity

public class Sinistre implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id_sinistre;
	@NotEmpty
    private String mode_gestion;
	@NotEmpty
     private String type_sinistre;
	@Temporal(TemporalType.DATE)
     private Date date_sinistre;
	@NotEmpty
     private String lieu_sinistre;
	@Temporal(TemporalType.DATE)
     private Date date_decla;
	@Temporal(TemporalType.DATE)
     private Date date_cloture;
	 private String statut;
     private String qualification;
     private Double reserve;
     @ManyToMany
     @LazyCollection(LazyCollectionOption.FALSE)
     private List<Intervenant> intrervenant;
     @OneToMany(mappedBy="sinistre")
     @LazyCollection(LazyCollectionOption.FALSE)
     private List<Etat> etat_sinistre;
     @OneToMany(mappedBy="sinistre")
     private List<Document_sinist> doc_sinistre;
     @OneToMany(mappedBy="sinistre")
     private List<Rapport> rapport;
     @OneToOne
     private Indemnisation indemnisation;
     @OneToMany(cascade={CascadeType.REMOVE})
 	@JoinTable(name = "SIN_HSIN", joinColumns = @JoinColumn(name = "SIN_ID"), inverseJoinColumns = @JoinColumn(name = "H_ID"))
     private List<SinistreH> sinistreh;
     @ManyToOne
     private Contrat contrat;
     
     
     
	public Sinistre() {
		super();
	}

	public Sinistre(String mode_gestion, String type_sinistre,
			Date date_sinistre, String lieu_sinistre, Date date_decla,
			Date date_cloture, String statut, String qualification,
			Double reserve, List<Intervenant> intrervenant,
			List<Etat> etat_sinistre, List<Document_sinist> doc_sinistre,
			List<Rapport> rapport, Indemnisation indemnisation,
			List<SinistreH> sinistreh, Contrat contrat) {
		super();
		this.mode_gestion = mode_gestion;
		this.type_sinistre = type_sinistre;
		this.date_sinistre = date_sinistre;
		this.lieu_sinistre = lieu_sinistre;
		this.date_decla = date_decla;
		this.date_cloture = date_cloture;
		this.statut = statut;
		this.qualification = qualification;
		this.reserve = reserve;
		this.intrervenant = intrervenant;
		this.etat_sinistre = etat_sinistre;
		this.doc_sinistre = doc_sinistre;
		this.rapport = rapport;
		this.indemnisation = indemnisation;
		this.sinistreh = sinistreh;
		this.contrat = contrat;
	}

	public Long getId_sinistre() {
		return id_sinistre;
	}

	public void setId_sinistre(Long id_sinistre) {
		this.id_sinistre = id_sinistre;
	}

	public String getMode_gestion() {
		return mode_gestion;
	}

	public void setMode_gestion(String mode_gestion) {
		this.mode_gestion = mode_gestion;
	}

	public String getType_sinistre() {
		return type_sinistre;
	}

	public void setType_sinistre(String type_sinistre) {
		this.type_sinistre = type_sinistre;
	}

	public Date getDate_sinistre() {
		return date_sinistre;
	}

	public void setDate_sinistre(Date date_sinistre) {
		this.date_sinistre = date_sinistre;
	}

	public String getLieu_sinistre() {
		return lieu_sinistre;
	}

	public void setLieu_sinistre(String lieu_sinistre) {
		this.lieu_sinistre = lieu_sinistre;
	}

	public Date getDate_decla() {
		return date_decla;
	}

	public void setDate_decla(Date date_decla) {
		this.date_decla = date_decla;
	}

	public Date getDate_cloture() {
		return date_cloture;
	}

	public void setDate_cloture(Date date_cloture) {
		this.date_cloture = date_cloture;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Double getReserve() {
		return reserve;
	}

	public void setReserve(Double reserve) {
		this.reserve = reserve;
	}

	public List<Intervenant> getIntrervenant() {
		return intrervenant;
	}

	public void setIntrervenant(List<Intervenant> intrervenant) {
		this.intrervenant = intrervenant;
	}

	public List<Etat> getEtat_sinistre() {
		return etat_sinistre;
	}

	public void setEtat_sinistre(List<Etat> etat_sinistre) {
		this.etat_sinistre = etat_sinistre;
	}

	public List<Document_sinist> getDoc_sinistre() {
		return doc_sinistre;
	}

	public void setDoc_sinistre(List<Document_sinist> doc_sinistre) {
		this.doc_sinistre = doc_sinistre;
	}

	public List<Rapport> getRapport() {
		return rapport;
	}

	public void setRapport(List<Rapport> rapport) {
		this.rapport = rapport;
	}

	public Indemnisation getIndemnisation() {
		return indemnisation;
	}

	public void setIndemnisation(Indemnisation indemnisation) {
		this.indemnisation = indemnisation;
	}

	public List<SinistreH> getSinistreh() {
		return sinistreh;
	}

	public void setSinistreh(List<SinistreH> sinistreh) {
		this.sinistreh = sinistreh;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
     
	
}

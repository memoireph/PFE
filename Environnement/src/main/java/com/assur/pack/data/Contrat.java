package com.assur.pack.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;
import org.hibernate.validator.constraints.NotEmpty;

@Entity

public class Contrat implements Serializable{
    @Id
	private String Num_contrat;
    @NotEmpty
	private String vehicule;
	private int franchise;
 
    @Temporal(TemporalType.DATE)
	private Date date_debut;
    
    @Temporal(TemporalType.DATE)
	private Date date_fin;   
    @OneToMany(mappedBy="contrat")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Sinistre> sinistre;
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Garanties> garanties;
    
    public Contrat(){
    	
    }
    public Contrat(String num_contrat, String vehicule, int franchise,
			Date date_debut, Date date_fin) {
		super();
		Num_contrat = num_contrat;
		this.vehicule = vehicule;
		this.franchise = franchise;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	public String getNum_contrat() {
		return Num_contrat;
	}
	public void setNum_contrat(String num_contrat) {
		Num_contrat = num_contrat;
	}
	public String getVehicule() {
		return vehicule;
	}
	public void setVehicule(String vehicule) {
		this.vehicule = vehicule;
	}
	public int getFranchise() {
		return franchise;
	}
	public void setFranchise(int franchise) {
		this.franchise = franchise;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public List<Sinistre> getSinistre() {
		return sinistre;
	}
	public void setSinistre(List<Sinistre> sinistre) {
		this.sinistre = sinistre;
	}
	public List<Garanties> getGaranties() {
		return garanties;
	}
	public void setGaranties(List<Garanties> garanties) {
		this.garanties = garanties;
	}
	
	
} 

package com.assur.pack.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Contrat implements Serializable{
    @Id
	private String Num_contrat;
    @NotEmpty
	private String vehicule;
    @NotEmpty
	private int franchise;
    @NotEmpty
    @Temporal(TemporalType.DATE)
	private Date date_debut;
    @NotEmpty
    @Temporal(TemporalType.DATE)
	private Date date_fin;
    @OneToOne
    private Victime victime;
    @OneToOne
    private Sinistre sinistre;
    @OneToMany(mappedBy="contrat")
    private List<Garanties> garanties;
	
} 

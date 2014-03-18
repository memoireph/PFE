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
	protected List<Telephones> telephones;
	protected List<Domiciles> domiciles;
	protected List<Activites> activites;
	protected List<Liens> liens;
	protected List<Tiers> tiers;

}

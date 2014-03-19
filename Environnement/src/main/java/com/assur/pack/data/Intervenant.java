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

}

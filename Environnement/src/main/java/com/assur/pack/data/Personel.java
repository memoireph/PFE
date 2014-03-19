package com.assur.pack.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Personel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_personnel;
	@Size(min=6)
	private String login;
	@Size(min=6)
	private String motdepasse;
	@NotEmpty
	private String nom;
	@NotEmpty
	private String prenom;
	@NotEmpty
	private String role;//gestionnaire ou regleur
	@OneToMany(mappedBy="personel")
	private List<Avis> avis;
	@ManyToOne
	private Compagnie compagnie;
	
}

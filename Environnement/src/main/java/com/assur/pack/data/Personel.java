package com.assur.pack.data;

import java.io.Serializable;
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
public class Personel  implements Serializable{
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
	
	
	public Personel() {
		super();
	}

	public Personel(String login, String motdepasse, String nom, String prenom,
			String role, List<Avis> avis, Compagnie compagnie) {
		super();
		this.login = login;
		this.motdepasse = motdepasse;
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
		this.avis = avis;
		this.compagnie = compagnie;
	}

	public Long getId_personnel() {
		return id_personnel;
	}

	public void setId_personnel(Long id_personnel) {
		this.id_personnel = id_personnel;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}
	
	
	
}

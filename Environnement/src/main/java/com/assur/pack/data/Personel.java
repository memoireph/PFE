package com.assur.pack.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Personel  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_personnel;
	@NotEmpty
	private String login;
	@NotEmpty
	private String motdepasse;
	@NotEmpty
	private String nom;
	@NotEmpty
	private String prenom;
	@Email
	private String email;
	private boolean actived;
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="id_personnel")
	private List<Role> roles;//gestionnaire où regleur où admin
	@OneToMany(mappedBy="personel")
	private List<Avis> avis;
	@ManyToOne
	private Compagnie compagnie;
	
	
	public Personel() {
		super();
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public boolean isActived() {
		return actived;
	}



	public List<Role> getRoles() {
		return roles;
	}



	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}



	public Personel(String login, String motdepasse, String nom, String prenom,
			boolean actived, List<Avis> avis, Compagnie compagnie, String email) {
		super();
		this.login = login;
		this.motdepasse = motdepasse;
		this.nom = nom;
		this.prenom = prenom;
		this.actived = actived;
		this.avis = avis;
		this.compagnie = compagnie;
		this.email=email;
	}



	public void setActived(boolean actived) {
		this.actived = actived;
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

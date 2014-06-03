package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.type.LobType;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Avis extends Rapport {
  //juste pour test
	private String ref;
	
	private String destination;
	@ManyToOne
	private Personel personel;
	@NotEmpty
	@Lob
	private byte[] fichier;
	private String type;
	private Long taille;
	public Avis() {
		super();
	}
	
	public Avis(String ref, String destination, Personel personel) {
		super();
		this.ref = ref;
		this.destination = destination;
		this.personel = personel;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Personel getPersonel() {
		return personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}

	public byte[] getFichier() {
		return fichier;
	}

	public void setFichier(byte[] fichier) {
		this.fichier = fichier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTaille() {
		return taille;
	}

	public void setTaille(Long taille) {
		this.taille = taille;
	}
	
	

	
	
}

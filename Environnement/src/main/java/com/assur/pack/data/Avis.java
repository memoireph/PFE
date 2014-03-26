package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Avis extends Rapport {
  //juste pour test
	private String ref;
	@NotEmpty
	private String destination;
	@ManyToOne
	private Personel personel;
	
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
	
	

	
	
}

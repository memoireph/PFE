package com.assur.pack.data;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Medecin extends Intervenant {
      @NotEmpty
	private String prenom;
}

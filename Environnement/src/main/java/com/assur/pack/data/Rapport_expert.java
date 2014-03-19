package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Rapport_expert extends Rapport {
     
	 private int ITT;
	 private String cause;
	 private String etat_avant;
	 private String blessure;
	 @ManyToOne
	 private Medecin medecin;
	 
}

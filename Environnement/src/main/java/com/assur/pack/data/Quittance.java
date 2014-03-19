package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Quittance {
    @Id
	private String num_quittance;
	private String type_quittance;
	@OneToOne
	private Indemnisation indemnisation;
	
}

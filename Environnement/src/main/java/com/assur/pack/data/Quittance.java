package com.assur.pack.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Quittance implements Serializable{
    @Id
	private String num_quittance;
	private String type_quittance;
	@OneToOne
	private Indemnisation indemnisation;
	
	public Quittance() {
		super();
	}

	public Quittance(String num_quittance, String type_quittance,
			Indemnisation indemnisation) {
		super();
		this.num_quittance = num_quittance;
		this.type_quittance = type_quittance;
		this.indemnisation = indemnisation;
	}

	public String getNum_quittance() {
		return num_quittance;
	}

	public void setNum_quittance(String num_quittance) {
		this.num_quittance = num_quittance;
	}

	public String getType_quittance() {
		return type_quittance;
	}

	public void setType_quittance(String type_quittance) {
		this.type_quittance = type_quittance;
	}

	public Indemnisation getIndemnisation() {
		return indemnisation;
	}

	public void setIndemnisation(Indemnisation indemnisation) {
		this.indemnisation = indemnisation;
	}
	
	
}

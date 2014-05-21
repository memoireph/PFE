package com.assur.pack.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
@Entity
public class Telephones implements Serializable{
     @Id
     @Size(min=10)
	private String num_tel;
	private String type_tel;
	/*
	@ManyToOne
	private Intervenant intervenant;
	
	*/
	public Telephones() {
		super();
	}

	public Telephones(String num_tel, String type_tel) {
		super();
		this.num_tel = num_tel;
		this.type_tel = type_tel;
		
	}

	public String getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}

	public String getType_tel() {
		return type_tel;
	}

	public void setType_tel(String type_tel) {
		this.type_tel = type_tel;
	}

	
	
}

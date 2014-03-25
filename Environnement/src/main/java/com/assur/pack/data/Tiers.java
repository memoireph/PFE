package com.assur.pack.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Tiers {
     @Id
 	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code_tier;
	private String type_tier;
	private String infos_tier;
	@ManyToOne
	private Intervenant intervenant;
	
	
	public Tiers() {
		super();
	}

	public Tiers(String type_tier, String infos_tier, Intervenant intervenant) {
		super();
		this.type_tier = type_tier;
		this.infos_tier = infos_tier;
		this.intervenant = intervenant;
	}

	public Long getCode_tier() {
		return code_tier;
	}

	public void setCode_tier(Long code_tier) {
		this.code_tier = code_tier;
	}

	public String getType_tier() {
		return type_tier;
	}

	public void setType_tier(String type_tier) {
		this.type_tier = type_tier;
	}

	public String getInfos_tier() {
		return infos_tier;
	}

	public void setInfos_tier(String infos_tier) {
		this.infos_tier = infos_tier;
	}

	public Intervenant getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}
	
}

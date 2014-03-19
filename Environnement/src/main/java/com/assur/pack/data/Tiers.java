package com.assur.pack.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Tiers {
     @Id
	private Long code_tier;
	private String type_tier;
	private String infos_tier;
	@ManyToOne
	private Intervenant intervenant;
}

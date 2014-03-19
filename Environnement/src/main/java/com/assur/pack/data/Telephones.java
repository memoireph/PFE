package com.assur.pack.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
@Entity
public class Telephones {
     @Id
     @Size(min=10)
	private String num_tel;
	private String type_tel;
	@ManyToOne
	private Intervenant intervenant;
}

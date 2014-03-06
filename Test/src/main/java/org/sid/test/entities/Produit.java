package org.sid.test.entities;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="produits")
public class Produit implements Serializable{
      
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_produit")
	private Long idProduit;
	@NotEmpty
	@Column(name="nom_produit")
    private String nomProduit;
	@NotEmpty
	@Column(name="desc_produit")
    private String descProduit;
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getDescProduit() {
		return descProduit;
	}
	public void setDescProduit(String descProduit) {
		this.descProduit = descProduit;
	}
	
	public Produit() {
		super();
	}
	public Produit(String nomProduit, String descProduit) {
		super();
		this.nomProduit = nomProduit;
		this.descProduit = descProduit;
	}
     
	
      
}

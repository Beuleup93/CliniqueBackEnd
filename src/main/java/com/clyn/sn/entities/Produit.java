package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Produit implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String refProduit;
	
	private int quantite;
	
	@Column(length = 50)
	private String libelle;
	
	private double prixUnitaire;
	
	@Column(nullable = true)
	private int seuilAlerte;
	
	@Column(nullable = true)
	private int seuilMax;
	
	private String codeBarre;
	
	private boolean sup;
	
	@ManyToOne
	@JsonIgnoreProperties(value = "Produits",allowGetters = false)
	private Rayon rayon;
	
//	@ManyToOne
//	@JsonIgnoreProperties(value = "produits",allowGetters = false)
//	private Personnel personnel;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate;
	
	@OneToMany(mappedBy = "produit")
	@JsonIgnoreProperties(value = "produit",allowGetters = false)
	private Collection<LigneVente> ligneVentes;
	
	@OneToMany(mappedBy = "produit")
	@JsonIgnoreProperties(value = "produit",allowGetters = false)
	private Collection<LigneCommande> ligneCommandes;
	
	@OneToMany(mappedBy = "produit")
	@JsonIgnoreProperties(value = "produit",allowGetters = false)
	private Collection<LigneLivraison> ligneLivraisons;
}

package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class LigneCommande implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	private int qteCommande;
	
	@ManyToOne
	@JsonIgnoreProperties(value = "ligneCommandes",allowGetters = false)
	private Produit produit;
	
	@ManyToOne
	@JsonIgnoreProperties(value = "ligneCommandes",allowGetters = false)
	private Commande commande;
	
//	@ManyToOne
//	@JsonIgnoreProperties(value = "ligneCommandes",allowGetters = false)
//	private Personnel personnel;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate; 
	
	
}

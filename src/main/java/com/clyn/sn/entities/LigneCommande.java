package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@JsonIgnore
	@ManyToOne
	private Produit produit;
	
	@JsonIgnore
	@ManyToOne
	private Commande commande;
	
	@JsonIgnore
	@ManyToOne
	private User user;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate; 
	
	
}

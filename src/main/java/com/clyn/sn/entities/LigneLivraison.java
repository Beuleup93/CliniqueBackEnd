package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@AllArgsConstructor
@NoArgsConstructor
public class LigneLivraison implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int qteLivree;
	
	private String typeLivraisonProduit;
	
	@ManyToOne
	@JsonIgnoreProperties(value = "ligneLivraisons",allowGetters = false)
	private Produit produit;
	
	@ManyToOne
	@JsonIgnoreProperties(value = "ligneLivraisons",allowGetters = false)
	private Livraison livraison;
	
//	@ManyToOne
//	@JsonIgnoreProperties(value = "ligneLivraisons",allowGetters = false)
//	private Personnel personnel;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate;
	

}

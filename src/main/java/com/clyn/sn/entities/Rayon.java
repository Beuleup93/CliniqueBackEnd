package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Rayon implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, unique = true)
	private String libelle;
	
	private String description;
	
	private boolean del;
	
//	@ManyToOne
//	@JsonIgnoreProperties(value = "rayons",allowGetters = false)
//	private Personnel personnel;
	
	@Temporal(TemporalType.DATE)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIME)
	private Date heureCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate;
	
	@OneToMany(mappedBy = "rayon")
	@JsonIgnoreProperties(value = "rayon",allowGetters = false)
	private Collection<Produit> produits;
	

}

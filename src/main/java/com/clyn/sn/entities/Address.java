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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String pays;
	
	private String ville;
	
	private String quartier;
	
	private int rue;
	
	private boolean sup;
	
	@JsonIgnore
	@ManyToOne
	private Fournisseur fournisseur;
	
	@JsonIgnore
	@ManyToOne
	private User user;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate; 

}

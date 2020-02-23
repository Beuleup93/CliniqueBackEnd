package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
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
public class Vente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String ref;
	
	private Date dateVente;
	
	private boolean sup;

//	@ManyToOne
//	@JsonIgnoreProperties(value = "ventes",allowGetters = false)
//	private Personnel personnel;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate;
	
	@OneToMany(mappedBy = "vente")
	@JsonIgnoreProperties(value = "vente",allowGetters = false)
	private Collection<LigneVente> ligneVentes;
}

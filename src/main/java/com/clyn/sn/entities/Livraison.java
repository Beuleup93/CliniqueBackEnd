package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Livraison implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String ref;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLivraison;
	
	private String typeLivraison;
	
	private boolean sup;
	
	@JsonIgnore
	@ManyToOne
	private User user;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate; 
	
	@OneToMany(mappedBy = "livraison")
	private Collection<LigneLivraison> ligneLivraisons;
	
	@OneToMany(mappedBy = "livraison")
	private Collection<Reserve> reserves;

}

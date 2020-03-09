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
public class Commande implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	@Id
	private String ref;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	private int delaiLivraisonCom;
	
	@OneToMany(mappedBy = "commande")
	@JsonIgnoreProperties(value = "commande",allowGetters = false)
	private Collection<CommandeFournisseur> commandeFournisseurs;
	
//	@ManyToOne
//	@JsonIgnoreProperties(value = "commandes",allowGetters = false)
//	private Personnel personnel;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate; 
	
	@OneToMany(mappedBy = "commande")
	@JsonIgnoreProperties(value = "commande",allowGetters = false)
	private Collection<LigneCommande> ligneCommandes;
	

}

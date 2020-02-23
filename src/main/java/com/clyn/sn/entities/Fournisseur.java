package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String ref;
	
	@Column(name="Nom", length = 50, nullable = false)
	private String nom;
	
	@Column(name="Tel", length = 50, nullable = true)
	private String tel;
	
	@Email
	@Column(name="Email", length = 30)
	private String email;
	
	private boolean sup;
	
//	@ManyToOne
//	@JsonIgnoreProperties(value = "fournisseurs",allowGetters = false)
//	private Personnel personnel;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate;
	
	@OneToMany(mappedBy = "fournisseur")
	@JsonIgnoreProperties(value = "fournisseur",allowGetters = false)
	private Collection<CommandeFournisseur> commandeFournisseurs;
	
	@OneToMany(mappedBy = "fournisseur")
	@JsonIgnoreProperties(value = "fournisseur",allowGetters = false)
	private Collection<Address> addresses;

}

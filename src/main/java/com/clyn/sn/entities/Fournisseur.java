package com.clyn.sn.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@JsonIgnore
	@ManyToOne
	private User user;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate;
	
	@OneToMany(mappedBy = "fournisseur")
	private Collection<CommandeFournisseur> commandeFournisseurs;
	
	@OneToMany(mappedBy = "fournisseur")
	private Collection<Address> addresses;

}

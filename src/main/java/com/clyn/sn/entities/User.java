package com.clyn.sn.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "User")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	
	@Column(name = "Nom", length = 50, nullable = false)
	private String nom;
	
	@Column(name = "Prenom", length = 50, nullable = false)
	private String prenom;
	
	@Column(name = "Email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "Alias", length = 5)
	private String alias;
	
	@Column(name = "Username", length = 50, nullable = false)
	private String username;
	
	@Column(name = "Password", length = 50, nullable = true)
	private String password;
	
	@Column(name = "Active")
	private boolean active;
	
	@Column(name = "Tel",nullable = true)
	private double telephone;
	
	@ManyToOne
	private User parentUser;
	
	@Column(name = "DateNaissance", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@OneToMany(mappedBy = "user")
	private Collection<Rayon> rayons;

	public User(String nom, String prenom, String email, String alias, String username, boolean active) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.alias = alias;
		this.username = username;
		this.active = active;
	}
}

package com.clyn.sn.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "User")
public class User {

	@Id @GeneratedValue
	private Integer ID;
	
	@Column(name = "Nom", length = 50, nullable = false)
	private String nom;
	
	@Column(name = "Prenom", length = 50, nullable = false)
	private String prenom;
	
	@Column(name = "Email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "Alias", length = 50, nullable = false)
	private String alias;
	
	@Column(name = "Username", length = 50, nullable = true)
	private String username;
	
	@Column(name = "Password", length = 50, nullable = true)
	private String password;
	
	@Column(name = "Active")
	private boolean active;
	
	@Column(name = "Tel",nullable = true)
	private double telephone;
	
	@Column(name = "DateNaissance", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;

	
	public User() {
		super();
	}

	public User(String nom, String prenom, String email, String alias, String username, boolean active) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.alias = alias;
		this.username = username;
		this.active = active;
	}

	public User(String nom, String prenom, String email, String alias, String username, String password, boolean active,
			double telephone, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.alias = alias;
		this.username = username;
		this.password = password;
		this.active = active;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getTelephone() {
		return telephone;
	}

	public void setTelephone(double telephone) {
		this.telephone = telephone;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", alias=" + alias
				+ ", username=" + username + ", password=" + password + ", active=" + active + ", telephone="
				+ telephone + ", dateNaissance=" + dateNaissance + "]";
	}
}

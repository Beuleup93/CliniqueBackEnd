package com.clyn.sn.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Personnel")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Personnel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String matricule;
	
	@Column(unique = false, length = 254, nullable = true)
	private String adresse;
	
	@Column(name = "Nom", length = 50, nullable = true)
	private String nom;
	
	@Column(name = "Prenom", length = 50, nullable = true)
	private String prenom;
	
	@Column(name = "Email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "Alias", length = 10)
	private String alias;
	
	@Column(name = "Username", length = 50, nullable = false)
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
	/*
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<Rayon> rayons;
	 */
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastUpdate;
	
	/*
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<Produit> produits;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<Address> addresses;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<Commande> commandes;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<CommandeFournisseur> commandeFournisseurs;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<Fournisseur> fournisseurs;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<LigneCommande> ligneCommandes;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<LigneLivraison> ligneLivraisons;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<LigneVente> ligneVentes;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<Livraison> livraisons;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<Vente> ventes;
	 * 
	 * @OneToMany(mappedBy = "personnel")
	 * 
	 * @JsonIgnoreProperties(value = "personnel",allowGetters = false) private
	 * Collection<Reserve> reserves;
	 */
	
	public Personnel(String nom, String prenom, String email, String alias, String username, boolean active) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.alias = alias;
		this.username = username;
		this.active = active;
	}
}

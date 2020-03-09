package com.clyn.sn.service;

import java.util.List;

import com.clyn.sn.entities.Commande;

public interface ICommandeService {

	public List<Commande> findAllCommande();
	public Commande saveCommande(Commande commande);
	public Commande updateCommande(Commande commande);
	public void deleteCommande(Commande commande);
	public Commande findOneCommande(String id);
}

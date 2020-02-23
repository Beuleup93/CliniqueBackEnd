package com.clyn.sn.service;

import java.util.List;

import com.clyn.sn.entities.Produit;

public interface IProduitService {

	public List<Produit> findAllProduit();
	public Produit saveProduit(Produit produit);
	public Produit updateProduit(Produit produit);
	public void deleteProduit(Produit produit);
	public Produit findOneProduit(Long id);
}

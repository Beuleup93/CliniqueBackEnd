package com.clyn.sn.service;

import java.util.List;

import com.clyn.sn.entities.LigneCommande;

public interface ILigneCommandeService {

	public List<LigneCommande> findAllLigneCommande();
	public LigneCommande saveLigneCommande(LigneCommande ligneCommande);
	public LigneCommande updateLigneCommande(LigneCommande ligneCommande);
	public void deleteLigneCommande(LigneCommande ligneCommande);
	public LigneCommande findOneLigneCommande(Long id);
}

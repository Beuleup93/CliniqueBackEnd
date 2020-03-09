package com.clyn.sn.service;

import java.util.List;

import com.clyn.sn.entities.LigneVente;

public interface ILigneVenteService {

	public List<LigneVente> findAllLigneVente();
	public LigneVente saveLigneVente(LigneVente ligneVente);
	public LigneVente updateLigneVente(LigneVente ligneVente);
	public void deleteLigneVente(LigneVente ligneVente);
	public LigneVente findOneLigneVente(Long id);
}

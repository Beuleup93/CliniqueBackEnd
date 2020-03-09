package com.clyn.sn.service;

import java.util.List;

import com.clyn.sn.entities.Vente;

public interface IVenteService {

	public List<Vente> findAllVente();
	public Vente saveVente(Vente vente);
	public Vente updateVente(Vente vente);
	public void deleteVente(Vente vente);
	public Vente findOneVente(String id);
}

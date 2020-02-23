package com.clyn.sn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clyn.sn.dao.LigneVenteRepository;
import com.clyn.sn.entities.LigneVente;

@Service
@Transactional
public class ILigneVenteServiceImpl implements ILigneVenteService {

	@Autowired
	private LigneVenteRepository ligneVenteRepository;
	
	@Override
	public List<LigneVente> findAllLigneVente() {
		return ligneVenteRepository.findAll();
	}

	@Override
	public LigneVente saveLigneVente(LigneVente ligneVente) {
		return ligneVenteRepository.save(ligneVente);
	}

	@Override
	public LigneVente updateLigneVente(LigneVente ligneVente) {
		return ligneVenteRepository.saveAndFlush(ligneVente);
		
	}

	@Override
	public void deleteLigneVente(LigneVente ligneVente) 
	{
		ligneVenteRepository.delete(ligneVente);
	}

	@Override
	public LigneVente findOneLigneVente(Long id) {
		 Optional<LigneVente> stmp = ligneVenteRepository.findById(id); 
		  if (stmp.isPresent()) 
		  	return stmp.get(); 
		  return null;
	}
}

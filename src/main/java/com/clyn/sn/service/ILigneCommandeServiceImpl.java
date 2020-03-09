package com.clyn.sn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.clyn.sn.dao.LigneCommandeRepository;
import com.clyn.sn.entities.LigneCommande;

@Service
@Transactional
public class ILigneCommandeServiceImpl implements ILigneCommandeService  {
	@Autowired
	private LigneCommandeRepository ligneCommandeRepository;
	
	@Override
	public List<LigneCommande> findAllLigneCommande() {
		return ligneCommandeRepository.findAll();
	}

	@Override
	public LigneCommande saveLigneCommande(LigneCommande ligneCommande) {
		return ligneCommandeRepository.save(ligneCommande);
	}

	@Override
	public LigneCommande updateLigneCommande(LigneCommande ligneCommande) {
		return ligneCommandeRepository.saveAndFlush(ligneCommande);
		
	}

	@Override
	public void deleteLigneCommande(LigneCommande ligneCommande) 
	{
		ligneCommandeRepository.delete(ligneCommande);
	}

	@Override
	public LigneCommande findOneLigneCommande(Long id) {
		 Optional<LigneCommande> stmp = ligneCommandeRepository.findById(id); 
		  if (stmp.isPresent()) 
		  	return stmp.get(); 
		  return null;
	}
}

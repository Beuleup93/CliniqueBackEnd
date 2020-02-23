package com.clyn.sn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clyn.sn.dao.ProduitRepository;
import com.clyn.sn.entities.Produit;

@Service
@Transactional
public class IProduitServiceImpl implements IProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> findAllProduit() {
		return produitRepository.findAll();
	}

	@Override
	public Produit saveProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public Produit updateProduit(Produit produit) {
		return produitRepository.saveAndFlush(produit);
		
	}

	@Override
	public void deleteProduit(Produit produit) 
	{
		produitRepository.delete(produit);
	}

	@Override
	public Produit findOneProduit(Long id) {
		
		 Optional<Produit> stmp = produitRepository.findById(id); 
		  if (stmp.isPresent()) 
		  	return stmp.get(); 
		  return null;
	}
}

package com.clyn.sn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clyn.sn.dao.CommandeRepository;
import com.clyn.sn.entities.Commande;

@Service
@Transactional
public class ICommandeServiceImpl implements ICommandeService {

	@Autowired
	private CommandeRepository commandeRepository;
	
	@Override
	public List<Commande> findAllCommande() {
		return commandeRepository.findAll();
	}

	@Override
	public Commande saveCommande(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Override
	public Commande updateCommande(Commande commande) {
		return commandeRepository.saveAndFlush(commande);
		
	}

	@Override
	public void deleteCommande(Commande commande) 
	{
		commandeRepository.delete(commande);
	}

	@Override
	public Commande findOneCommande(String id) {
		
		  Optional<Commande> stmp = commandeRepository.findById(id); 
		  if (stmp.isPresent()) 
		  	return stmp.get(); 
		  return null;
	}
}

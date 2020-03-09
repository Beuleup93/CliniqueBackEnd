package com.clyn.sn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clyn.sn.dao.VenteRepository;
import com.clyn.sn.entities.Vente;

@Service
@Transactional
public class IVenteServiceImpl implements IVenteService {

	@Autowired
	private VenteRepository venteRepository;
	
	@Override
	public List<Vente> findAllVente() {
		return venteRepository.findAll();
	}

	@Override
	public Vente saveVente(Vente vente) {
		return venteRepository.save(vente);
	}

	@Override
	public Vente updateVente(Vente vente) {
		return venteRepository.saveAndFlush(vente);
		
	}

	@Override
	public void deleteVente(Vente vente) 
	{
		venteRepository.delete(vente);
	}

	@Override
	public Vente findOneVente(String id) {
		
		 Optional<Vente> stmp = venteRepository.findById(id); 
		  if (stmp.isPresent()) 
		  	return stmp.get(); 
		  return null;
	}

}

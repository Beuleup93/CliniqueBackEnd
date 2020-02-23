package com.clyn.sn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clyn.sn.dao.RayonRepository;
import com.clyn.sn.entities.Rayon;

@Service
@Transactional
public class IRayonServiceImpl implements IRayonService {

	@Autowired
	private RayonRepository rayonRepository;
	
	@Override
	public List<Rayon> findAllRayon() {
		return rayonRepository.findAll();
	}

	@Override
	public Rayon saveRayon(Rayon rayon) {
		return rayonRepository.save(rayon);
	}

	@Override
	public Rayon updateRayon(Rayon rayon) {
		return rayonRepository.saveAndFlush(rayon);
		
	}

	@Override
	public void deleteRayon(Rayon rayon) 
	{
		rayonRepository.delete(rayon);
	}

	@Override
	public Rayon findOneRayon(Long id) {
		
		 Optional<Rayon> stmp = rayonRepository.findById(id); 
		  if (stmp.isPresent()) 
		  	return stmp.get(); 
		  return null;
	}
}

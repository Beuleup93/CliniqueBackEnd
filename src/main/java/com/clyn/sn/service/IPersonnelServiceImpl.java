package com.clyn.sn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clyn.sn.dao.PersonnelRepository;
import com.clyn.sn.entities.Personnel;

@Service
@Transactional
public class IPersonnelServiceImpl implements IPersonnelService{

	@Autowired
	private PersonnelRepository personnelRepository;
	
	@Override
	public List<Personnel> findAllPersonnel() {
		return personnelRepository.findAll();
	}

	@Override
	public Personnel savePersonnel(Personnel personnel) {
		return personnelRepository.save(personnel);
	}

	@Override
	public Personnel updatePersonnel(Personnel personnel) {
		return personnelRepository.saveAndFlush(personnel);
		
	}

	@Override
	public void deletePersonnel(Personnel personnel) {
		personnelRepository.delete(personnel);
	}

	@Override
	public Personnel findOnePersonnel(Long id) {
		
		  Optional<Personnel> stmp = personnelRepository.findById(id); 
		  if (stmp.isPresent()) 
		  	return stmp.get(); 
		  return null;
		 
	}

}

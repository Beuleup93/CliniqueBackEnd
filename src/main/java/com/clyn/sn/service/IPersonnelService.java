package com.clyn.sn.service;

import java.util.List;

import com.clyn.sn.entities.Personnel;

public interface IPersonnelService {

	public List<Personnel> findAllPersonnel();
	public Personnel savePersonnel(Personnel personnel);
	public Personnel updatePersonnel(Personnel personnel);
	public void deletePersonnel(Personnel personnel);
	public Personnel findOnePersonnel(Long id);
}

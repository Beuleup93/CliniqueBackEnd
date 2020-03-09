package com.clyn.sn.service;

import java.util.List;

import com.clyn.sn.entities.Rayon;

public interface IRayonService {
	public List<Rayon> findAllRayon();
	public Rayon saveRayon(Rayon rayon);
	public Rayon updateRayon(Rayon rayon);
	public void deleteRayon(Rayon rayon);
	public Rayon findOneRayon(Long id);
}

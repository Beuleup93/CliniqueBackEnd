package com.clyn.sn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.clyn.sn.entities.Reserve;

@RepositoryRestResource
public interface ReserveRepository extends JpaRepository<Reserve, String>{

}

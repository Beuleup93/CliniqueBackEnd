package com.clyn.sn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.clyn.sn.entities.Fournisseur;

@RepositoryRestResource
public interface FournisseurRepository extends JpaRepository<Fournisseur, String> {

}

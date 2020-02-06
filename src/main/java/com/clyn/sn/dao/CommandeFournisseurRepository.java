package com.clyn.sn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.clyn.sn.entities.CommandeFournisseur;

@RepositoryRestResource
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Long> {

}

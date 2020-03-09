package com.clyn.sn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clyn.sn.entities.Vente;

public interface VenteRepository extends JpaRepository<Vente, String> {

}

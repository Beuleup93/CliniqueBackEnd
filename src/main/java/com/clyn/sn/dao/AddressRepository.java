package com.clyn.sn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clyn.sn.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

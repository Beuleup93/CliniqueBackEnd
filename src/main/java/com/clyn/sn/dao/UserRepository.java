package com.clyn.sn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clyn.sn.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

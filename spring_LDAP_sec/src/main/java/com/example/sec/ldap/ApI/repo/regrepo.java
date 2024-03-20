package com.example.sec.ldap.ApI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sec.ldap.ApI.dto.dtoclass;



public interface regrepo  extends JpaRepository<dtoclass, String> {

}

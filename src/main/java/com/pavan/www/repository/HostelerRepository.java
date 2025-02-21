package com.pavan.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.www.model.Hostelers;

@Repository
public interface HostelerRepository extends JpaRepository<Hostelers,String> {
	boolean existsByMobileNumber( String mobileNumber);
	Hostelers findByMobileNumber(String mobileNumber);
}

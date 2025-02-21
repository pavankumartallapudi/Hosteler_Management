package com.pavan.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.www.model.Hostelers;
import com.pavan.www.repository.HostelerRepository;


@Service
public class HomeServices {

	@Autowired
	HostelerRepository hostelrepo;
	public Hostelers addHosteler( Hostelers hosteler) {
		return hostelrepo.save(hosteler);
		}
	public List<Hostelers> showHostelers() {
        return hostelrepo.findAll();
        }
     public  Hostelers findByMobileNumber(String mobileNumber){
		
    	 return hostelrepo.findByMobileNumber(mobileNumber);	
    	}
     public  boolean delPirticularHosteler(String mobileNumber){
    	 if (hostelrepo.existsByMobileNumber(mobileNumber)) {
    		 Hostelers hosteler = hostelrepo.findByMobileNumber(mobileNumber);
    	     hostelrepo.delete(hosteler);
    	         return true; 
    	 }
    	 return false;
 		
 	}
}

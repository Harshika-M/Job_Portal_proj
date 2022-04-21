package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.job_seeker.Applicant;
import com.registration.applicant_registration;
import com.repository.Applicant_repository;
import com.repository.aregistration_repository;

@Service
@Component
public class aregistration_serviceImpl implements aregistration_service {

	@Autowired
	aregistration_repository repo;
	@Autowired
	Applicant app;
	@Autowired
	Applicant_repository arepo;
	@Autowired
	Applicant_Service as;
	
	@Override
	public void savereg(applicant_registration a) {
		 repo.save(a);
		// as.iddet(a.getId());
	}

     public applicant_registration login(String username,String password) {
    	 List<applicant_registration> areglist=repo.findAll();
    	 return areglist.stream()
    	 .filter(e-> username.equals(e.getUsername()) && password.equals(e.getPassword())).findAny().orElse(null);
    	
     }
     
     @Override
     public Applicant studdet(String username,String password) {
		applicant_registration ar=login(username, password);
    	 int r=ar.getId();
    	 app.setId(ar.getId());
    	 return  arepo.getById(r);
    	 
    	 
     }
	
}



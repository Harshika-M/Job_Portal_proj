package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.job_provider.Employer;
import com.job_seeker.Applicant;
import com.registration.applicant_registration;
import com.repository.Applicant_repository;
import com.repository.Employer_repository;
import com.repository.aregistration_repository;

@Service
@Component
public class Applicant_serviceImpl implements Applicant_Service {

	@Autowired
	Applicant_repository arepo;
	@Autowired
	Employer_repository repository;
	@Autowired
	aregistration_repository regrepo;
	

	
	@Autowired
	Applicant a;
	@Autowired
	applicant_registration c;
	
	Applicant at;

	public void saveDetails(Applicant ap) {
		 arepo.save(ap);
		at=arepo.getById(ap.getId());
	}



	public List<Employer> getjobs() {
		List<Employer> elist=repository.findAll();
		return elist;
	}

	public Employer findbyrole(String role) {
		List<Employer> eplist=repository.findAll();
		return eplist.stream()
		.filter(e->role.equals(e.getRole())).findAny().orElse(null);

	}


	@Override
	public Applicant apply(int id) {
		
		Employer e=repository.getById(id);
		 at.getEmployer().add(e);
		 
		return at;
	}


	@Override
	public Applicant updatedetails(Applicant p, int id) {
		// TODO Auto-generated method stub
		Applicant at=arepo.getById(id);
		at.setName(p.getName());
		at.setAddress(p.getAddress());
		at.setEmailId(p.getEmailId());
		at.setExperience(p.getExperience());
		at.setGender(p.getGender());
		at.setHighest_qualification(p.getHighest_qualification());
		at.setSkills(p.getSkills());
		arepo.save(at);
		return null;
	}









/*
	@Override
	public Applicant signin(String username, String password) {
		// TODO Auto-generated method stub
		List<applicant_registration> al=regrepo.findAll();
		//if(al.contains(username) && al.contains(password)) {
		if(c.getUsername().equals(username)&&(c.getPassword().equals(password))) {
			List<Applicant> eplist=arepo.findAll();
			return eplist.stream()
			.filter(e->username.equals(e.getName())).findAny().orElse(null);
			
		}
		else 
			return null;
	}*/
}

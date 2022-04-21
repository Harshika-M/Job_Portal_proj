package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.job_provider.Employer;
import com.repository.Employer_repository;

@Service
public class Employer_serviceImpl implements Employer_Service {
	@Autowired
	Employer_repository repo;
	
	

	@Override
	public void saveDetails(Employer e) {
		repo.save(e);
		
	}


	@Override
	public Employer updatedetails(Employer emp, int jobCode) {
		// TODO Auto-generated method stub
		  Employer ep=repo.getById(jobCode);
		   ep.setContact(emp.getContact());
		   ep.setExperienceRequired(emp.getExperienceRequired());
		   ep.setRole(emp.getRole());
		   ep.setLocation(emp.getLocation());
		   ep.setQualification(emp.getQualification());
		   ep.setSkillSet(emp.getSkillSet());
		   ep.setSalary(emp.getSalary());
		   ep.setOrganization(emp.getOrganization());
		   repo.save(ep);
		   return ep;
	}

	/*@Override
	public Candidates_Applied candDetails(int jobCode) {
		List<Candidates_Applied> caList=ac.findAll();
		return caList.stream()
		.filter(e->jobCode==e.getC_jobCode()).findAny().orElse(null);
		
	}
*/



	}



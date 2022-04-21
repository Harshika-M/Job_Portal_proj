package com.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.job_seeker.Applicant;
import com.registration.applicant_registration;

@Service
@Component
public interface aregistration_service {
	public void savereg(applicant_registration a);
	public Applicant studdet(String username,String password);
}

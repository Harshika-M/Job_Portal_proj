package com.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.job_provider.Employer;
import com.job_seeker.Applicant;

@Service
@Component
public interface Applicant_Service {
	public void saveDetails(Applicant ap);
	public Applicant updatedetails(Applicant p, int id) ;
	public List<Employer> getjobs();
	public Employer findbyrole(String role);
	//public Applicant signin(String username,String password);
	public Applicant apply(int id);
}

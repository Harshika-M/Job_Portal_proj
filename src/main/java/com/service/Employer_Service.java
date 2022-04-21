package com.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.job_provider.Employer;

@Service
@Component
public interface Employer_Service {
	   public void  saveDetails(Employer E);
	 	public Employer updatedetails(Employer E, int jobCode);
	 	//public Candidates_Applied candDetails(int jobCode);
	 	//public List<Employer> getlist();
	 	/*public Employer findbyrole(String role);
	 	public Employer findbycompany(String company);
	 	public Employer findbylocation (String location);
	 	public void apply(String jobcode);*/
}

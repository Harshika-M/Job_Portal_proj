package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.job_provider.Employer;
import com.job_seeker.Applicant;
import com.registration.applicant_registration;
import com.service.Applicant_Service;
import com.service.aregistration_service;

@RestController
@RequestMapping("/candidate")
public class StudentController {

	@Autowired
	aregistration_service areg;
	@Autowired
	Applicant_Service aservice;
	
	
	
	@RequestMapping("/Jobportal")
	public String home() {
		String s="Welcome to JobPortal"+"\nRegister to explore more jobs"+"\nKindly follow the steps";
		return s;
	}
	
	@PostMapping("/step1")
	public ResponseEntity<applicant_registration> save(@RequestBody applicant_registration a){
		applicant_registration ar=a;
        areg.savereg(a);
		return new ResponseEntity<applicant_registration>(ar,HttpStatus.OK);
	}
	
	@GetMapping("/step2")
	public String register() {
		String s="Registration Successfull\n Fill the following details \n Name:\r\n"
				+ " EmailId:\r\n"
				+ " Address;\r\n"
				+ " Gender:\r\n"
				+ " Skills;\r\n"
				+ " Highest qualification:\r\n"
				+ " Experience in years:";
		return s;
		
	}
	
	@PostMapping("/step3")
	public ResponseEntity<Applicant> details(@RequestBody Applicant ap){
		Applicant obj=ap;
		aservice.saveDetails(ap);
		return  new ResponseEntity<Applicant>(obj,HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Applicant> logindet (@RequestBody String username,String password){
		Applicant obj=areg.studdet(username, password);
		return new ResponseEntity<Applicant>(obj,HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Applicant> update(@RequestBody Applicant p){
		aservice.updatedetails(p, p.getId());
		return new ResponseEntity<Applicant> (p,HttpStatus.OK);
	}

	@RequestMapping("/byrole/{role}")
	 public ResponseEntity <Employer> roleList(@PathVariable(value="role")String role){
		Employer e=aservice.findbyrole(role);
		return new ResponseEntity<Employer>(e,HttpStatus.OK);
	}

	@RequestMapping("/getjobs")
	List<Employer> productslist(){
	List<Employer> list=aservice.getjobs();
	for(Employer e:list) {
		System.out.println(e);
	}
	return list;
	}
	
     @RequestMapping("/apply/{id}")
	public Applicant apply (@PathVariable(value="id")int id){
		return aservice.apply(id);
		//return "Applied Sucessfully";
		
	
}
}



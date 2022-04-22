package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.job_provider.Employer;
import com.service.Employer_Service;

@RestController
@RequestMapping("/Employer")
public class EmployerController {
	
	//This is employer Controller
	//Sample comment

	@Autowired
	Employer_Service eservice;
	
	@PostMapping("/savedet")
	public ResponseEntity<Employer> details(@RequestBody Employer e){
		Employer obj=e;
		eservice.saveDetails(e);
		return  new ResponseEntity<Employer>(obj,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employer> update(@RequestBody Employer emp){
		eservice.updatedetails(emp, emp.getId());
		return new ResponseEntity<Employer> (emp,HttpStatus.OK);
	}	
	
	/*@RequestMapping("/candidates/{jobCode}")
	 public ResponseEntity <Candidates_Applied> roleList(@PathVariable(value="jobCode")int jobCode){
		Candidates_Applied e=eservice.candDetails(jobCode);
		return new ResponseEntity<Candidates_Applied>(e,HttpStatus.OK);
	}

	*/

}

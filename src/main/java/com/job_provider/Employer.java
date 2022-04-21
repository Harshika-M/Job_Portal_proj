package com.job_provider;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.job_seeker.Applicant;

@Entity
@Table(name="employer")
public class Employer {
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int id;
	   private String role;
	   private String organization;
	   private String location;
	   private String qualification;
	   private int experienceRequired;
	   private String skillSet;
	   private long salary;
	   private String contact;
	   @ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="employer")
	   private Set<Applicant> applicant=new HashSet<>();
	  
	public Employer() {
		super();
	}

	public Employer(int id, String role, String organization, String location, String qualification,
			int experienceRequired, String skillSet, long salary, String contact, Set<Applicant> applicant) {
		super();
		this.id = id;
		this.role = role;
		this.organization = organization;
		this.location = location;
		this.qualification = qualification;
		this.experienceRequired = experienceRequired;
		this.skillSet = skillSet;
		this.salary = salary;
		this.contact = contact;
		this.applicant = applicant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExperienceRequired() {
		return experienceRequired;
	}

	public void setExperienceRequired(int experienceRequired) {
		this.experienceRequired = experienceRequired;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Set<Applicant> getApplicant() {
		return applicant;
	}

	public void setApplicant(Set<Applicant> applicant) {
		this.applicant = applicant;
	}
	
	
	   
	   
}

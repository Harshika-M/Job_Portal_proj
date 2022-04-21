package com.job_seeker;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import org.springframework.stereotype.Repository;

import com.job_provider.Employer;

@Entity
@Repository
@Table(name="applicant")
public class Applicant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private String name;
    private String emailId;
    private String address;
    private String gender;
    private String skills;
    private String highest_qualification;
    private int experience;
    @ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinTable(name="applicant_employer",
    joinColumns= {@JoinColumn(name="applicant_id")},
    inverseJoinColumns= {@JoinColumn(name="employer_id")})
    private Set<Employer> employer=new HashSet<>();
    
	public Applicant() {
		super();
	}

	public Applicant(int id, String name, String emailId, String address, String gender, String skills,
			String highest_qualification, int experience, Set<Employer> employer) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.address = address;
		this.gender = gender;
		this.skills = skills;
		this.highest_qualification = highest_qualification;
		this.experience = experience;
		this.employer = employer;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getHighest_qualification() {
		return highest_qualification;
	}

	public void setHighest_qualification(String highest_qualification) {
		this.highest_qualification = highest_qualification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Set<Employer> getEmployer() {
		return employer;
	}

	public void setEmployer(Set<Employer> employer) {
		this.employer = employer;
	}
	
	
    
	
    
}

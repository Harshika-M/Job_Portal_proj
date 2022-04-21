package com.registration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Repository
@Entity
@Table(name="app_reg")
public class applicant_registration {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String username;
	String email_id;
	String password;
	public applicant_registration() {
		super();
	}
	public applicant_registration(int id, String username, String email_id, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email_id = email_id;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

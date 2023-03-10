package org.thepunisher.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class UserReg {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	private String username;
	
	private String password;
	
	private String email;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "DD/MM/YYYY")
	private Date dob;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "UserReg [username=" + username + ", password=" + password + ", email=" + email + ", dob=" + dob + "]";
	}
	public UserReg(String username, String password, String email, Date dob) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.dob = dob;
	}
	public UserReg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

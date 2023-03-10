package org.thepunisher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FormData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private String firstname;
	private String surname;
	private String username;
	private String password;
	private String birthcity;
	private String mobilenumber;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
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
	public String getBirthcity() {
		return birthcity;
	}
	public void setBirthcity(String birthcity) {
		this.birthcity = birthcity;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenum) {
		this.mobilenumber = mobilenum;
	}
	@Override
	public String toString() {
		return "FormData [firstname=" + firstname + ", surname=" + surname + ", username=" + username + ", password="
				+ password + ", birthcity=" + birthcity + ", mobilenum=" + mobilenumber + "]";
	}
	public FormData() {
		super();
	}
	

}

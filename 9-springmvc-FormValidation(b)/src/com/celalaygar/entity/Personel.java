package com.celalaygar.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

public class Personel {

	@NotNull
	@Size(min=3,message="en az 3 karakter olmalý")
	private String firstname;
	
	@NotNull
	@Size(max=10,message="en fazla 10 karakter olmalý.")
	private String lastname;
	
	@Email(message="email girilmeli")
	private String email;
	
	

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}





	
}

package com.celalaygar.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Personel {

	@NotNull
	@Size(min=3,message="en az 3 karakter olmalý")
	private String firstname;
	
	@NotNull
	@Size(max=10,message="en fazla 10 karakter olmalý.")
	private String lastname;
	
	@NotEmpty
	@Email(message="email girilmeli")
	private String email;
	
	
	@NotNull(message="yaþ bölümünü boþ geçmeyiniz")
	@Min(10)
	@Max(150)
	private int age;
	

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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}





	
}

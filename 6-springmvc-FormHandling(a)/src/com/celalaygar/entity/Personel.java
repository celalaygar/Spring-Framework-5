package com.celalaygar.entity;

public class Personel {
	private int id;
	
	private String name;
	private String email;
	private int salary;
	private String about;
	private String [] phoneModel;
	public Personel(){
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String[] getPhoneModel() {
		return phoneModel;
	}
	public void setPhoneModel(String[] phoneModel) {
		this.phoneModel = phoneModel;
	}


	
}

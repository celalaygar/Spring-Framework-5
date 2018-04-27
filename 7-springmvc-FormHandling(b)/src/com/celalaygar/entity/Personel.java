package com.celalaygar.entity;

public class Personel {
	
	private String name;
	private int salary;
	private String country;
	private String [] phoneModel;
	private String gender;
	private String averageAge;
	private String [] skills;
	public Personel(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String[] getPhoneModel() {
		return phoneModel;
	}
	public void setPhoneModel(String[] phoneModel) {
		this.phoneModel = phoneModel;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAverageAge() {
		return averageAge;
	}
	public void setAverageAge(String averageAge) {
		this.averageAge = averageAge;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}


	
}

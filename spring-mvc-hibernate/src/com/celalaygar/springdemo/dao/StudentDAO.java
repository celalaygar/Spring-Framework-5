package com.celalaygar.springdemo.dao;

import java.util.List;

import com.celalaygar.springdemo.entity.Student;

public interface StudentDAO {

	public List<Student> getStudents();

	public void saveStudent(Student theStudent);
	
	public Student getStudent(int id);

	public void deleteStudent(int id);


	
}

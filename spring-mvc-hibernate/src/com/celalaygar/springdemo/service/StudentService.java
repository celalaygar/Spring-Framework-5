package com.celalaygar.springdemo.service;

import java.util.List;

import com.celalaygar.springdemo.entity.Student;

public interface StudentService {
	
	public List<Student> getStudents();

	public void saveStudent(Student theStudent);


	public Student getStudent(int id);

	public void deleteStudent(int id);
}

package com.celalaygar.springdemo.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.celalaygar.springdemo.dao.StudentDAO;
import com.celalaygar.springdemo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	
	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}
	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getEmail());
		studentDAO.saveStudent(theStudent);
	}
	@Override
	@Transactional
	public Student getStudent(int id) {
		
		return studentDAO.getStudent(id);
	}
	@Override
	@Transactional
	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id);
		
	}

}

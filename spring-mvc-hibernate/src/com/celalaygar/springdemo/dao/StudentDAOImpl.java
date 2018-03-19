package com.celalaygar.springdemo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.celalaygar.springdemo.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionfactory;

	
	@Override
	public List<Student> getStudents() {
		Session currentSession=sessionfactory.getCurrentSession();
		Query<Student> theQuery=currentSession.createQuery("from Student", Student.class);
		List<Student> students=theQuery.getResultList();
		return students;
	}

	@Override
	public void saveStudent(Student theStudent) {
		Session currentSession=sessionfactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theStudent);
	}

	@Override
	public Student getStudent(int id) {
		Session currentSession=sessionfactory.getCurrentSession();
		Student theStudent=currentSession.get(Student.class,id);
		return theStudent;
	}
	@Override
	public void deleteStudent(int id) {
		Session currentSession=sessionfactory.getCurrentSession();
		System.out.println("1");
		Student theStudent=currentSession.get(Student.class, id);
		System.out.println("2");
		currentSession.delete(theStudent);
		System.out.println("3");
	}
	
/*
 * 	//UPDATE STUDENT ÝÞLEMÝ : id ye göre öðrenci günceller
	@Override
	public List<Student> updateStudent(Student theStudent,int id) {
		Session currentSession=sessionfactory.getCurrentSession();
		currentSession.update(theStudent);
		Query<Student> theQuery=currentSession.createQuery("from Student where id="+id, Student.class);
		List<Student> students=theQuery.getResultList();
		
		return students;
	}

	//SELECT STUDENT ÝÞLEMÝ : id ye göre öðrenci seçer
	@Override
	public List<Student> selectStudent(int id) {
		Session currentSession=sessionfactory.getCurrentSession();
		Query<Student> theQuery=currentSession.createQuery("from Student where id="+id, Student.class);
		List<Student> students=theQuery.getResultList();
		return students;
	}
 	*/


}

package com.celalaygar.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.celalaygar.springdemo.entity.Student;
import com.celalaygar.springdemo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//@RequestMapping(path="/list",method=RequestMethod.GET)
	@GetMapping("/list")
	public String ListStudent(Model theModel){
		List<Student> theStudent=studentService.getStudents();
		theModel.addAttribute("students", theStudent);
		return "list-student";
	}
	
	
	@GetMapping("/showStudentForm")
	public String showStudentForm(Model theModel){
		
		Student student=new Student(); 
		theModel.addAttribute("student", student);
		
		return "student-form"; 
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student theStudent){
		
		System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getEmail());
		studentService.saveStudent(theStudent);
		
		return "redirect:/student/list";
	}
	

	@GetMapping("/showFormForUpdate/{id}")
	public String viewAndEditStudent(@PathVariable("id") int id,Model themodel){
		
		Student student=studentService.getStudent(id);
		themodel.addAttribute("student", student);
		return "student-form";
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id,Model themodel){
		System.out.println("-");
		studentService.deleteStudent(id);
		System.out.println("- -");
		return "redirect:/student/list";
	}

}

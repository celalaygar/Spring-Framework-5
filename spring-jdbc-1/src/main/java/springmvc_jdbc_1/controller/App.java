package springmvc_jdbc_1.controller;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	Student student=new Student("kemal", "sunal", "kemal@gmail.com","kemalsunal");
    	
    	StudentDAOImp studentdao=context.getBean("studentDAO",StudentDAOImp.class);
    	//insert data
    	studentdao.addStudent(student);
    	
    	student=new Student("soysal fatih","durmaz","soysal_durmaz@gmail.com","soysal123");
    	
	//update data
    	studentdao.updateStudent(student, 2);
    	System.out.println("-------------------------------------------------------");
    	
	//delete data
	studentdao.deleteStudent(3);
    	System.out.println("-------------------------------------------------------");
	
	//select all data
    	for (Student newStudent : studentdao.getAllStudent()) {
			System.out.println(newStudent.getId()+
					" "+newStudent.getFirst_name()+
					" "+newStudent.getLast_name()+
					" "+newStudent.getEmail()+
					" "+newStudent.getPassword());
		}
    	System.out.println("-------------------------------------------------------");    	
	
	//select single data
    	student=studentdao.searchId(6);
    	studentdao.writerResult(student);
    	
    	System.out.println("Search first_name-------------------------------------------------------");
    	student=studentdao.SearchFirst_name("kemal");
    	studentdao.writerResult(student);
    	
    	System.out.println("Search email-------------------------------------------------------");
    	student=studentdao.searchEmail("mustafa@gmail.com");
    	studentdao.writerResult(student);
    }
 
    
}

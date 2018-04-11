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
    	
    	studentdao.addStudent(student);
    	
    	System.out.println("Search id-------------------------------------------------------");
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

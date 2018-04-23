package springmvc_jdbc_1.controller;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
	
	public Student searchId(int id);
	public Student SearchFirst_name(String first_name);
	public Student searchEmail(String email);
	public List<Student> getAllStudent();
	public void updateStudent(Student student, int id);
	public void deleteStudent(int id);
}

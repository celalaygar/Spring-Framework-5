package springmvc_jdbc_1.controller;

import java.sql.SQLException;

public interface StudentDAO {
	
	public Student searchId(int id);
	public Student SearchFirst_name(String first_name);
	public Student searchEmail(String email);
}

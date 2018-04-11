package springmvc_jdbc_1.controller;

import java.sql.*;

import javax.sql.*;

public class StudentDAOImp implements StudentDAO {

	private Connection connection;
	private String sql;
	private DataSource datasource;
	private Student student;
	
	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public void addStudent(Student student) throws SQLException{
		sql="INSERT INTO student (first_name, last_name, email, password) VALUES (?, ?, ?, ?)";
		connection = datasource.getConnection();
		PreparedStatement prepared;
		prepared=connection.prepareStatement(sql);
		prepared.setString(1, student.getFirst_name());
		prepared.setString(2, student.getLast_name());
		prepared.setString(3, student.getEmail());
		prepared.setString(4, student.getPassword());
		prepared.executeUpdate();
		prepared.close();
		connection.close();
	}

	public Student searchId(int id) {
		sql="SELECT * FROM student WHERE id=?";
		
		try {
			connection = datasource.getConnection();
			PreparedStatement prepared;
			prepared=connection.prepareStatement(sql);
			prepared.setInt(1, id);
			ResultSet result=prepared.executeQuery();
			if(result.next()){
				student=new Student(
						result.getInt("id"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getString("email"),
						result.getString("password")					
						);
			}
			result.close();
			prepared.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(connection !=null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return student;
	}

	public Student SearchFirst_name(String first_name) {
		sql="SELECT * FROM student WHERE first_name=?";
		try {
			connection = datasource.getConnection();
			PreparedStatement prepared;
			prepared=connection.prepareStatement(sql);
			prepared.setString(1, first_name);
			ResultSet result=prepared.executeQuery();
			if(result.next()){
				student=new Student(
						result.getInt("id"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getString("email"),
						result.getString("password")					
						);
			}
			result.close();
			prepared.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(connection !=null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return student;
	}

	public Student searchEmail(String email) {
		sql="SELECT * FROM student WHERE email=?";
		try {
			connection = datasource.getConnection();
			PreparedStatement prepared;
			prepared=connection.prepareStatement(sql);
			prepared.setString(1, email);
			ResultSet result=prepared.executeQuery();
			if(result.next()){
				student=new Student(
						result.getInt("id"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getString("email"),
						result.getString("password")					
						);
			}
			result.close();
			prepared.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(connection !=null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return student;
	}

   
    
    public void writerResult(Student student){
    	
    	System.out.println(student.getId()+" : "+
    			student.getFirst_name()+" "+
    			student.getLast_name()+" "+
    			student.getEmail()+" "+
    			student.getPassword());
    }

}

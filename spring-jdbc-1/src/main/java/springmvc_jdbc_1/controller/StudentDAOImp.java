package springmvc_jdbc_1.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.*;

import org.springframework.jdbc.core.JdbcTemplate;

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

	public void addStudent(Student student) throws SQLException {
		sql = "INSERT INTO student (first_name, last_name, email, password) VALUES (?, ?, ?, ?)";
		connection = datasource.getConnection();
		PreparedStatement prepared;
		prepared = connection.prepareStatement(sql);
		prepared.setString(1, student.getFirst_name());
		prepared.setString(2, student.getLast_name());
		prepared.setString(3, student.getEmail());
		prepared.setString(4, student.getPassword());
		prepared.executeUpdate();
		prepared.close();
		connection.close();
	}

	public Student searchId(int id) {
		sql = "SELECT * FROM student WHERE id=?";

		try {
			connection = datasource.getConnection();
			PreparedStatement prepared;
			prepared = connection.prepareStatement(sql);
			prepared.setInt(1, id);
			ResultSet result = prepared.executeQuery();
			if (result.next()) {
				student = new Student(result.getInt("id"), result.getString("first_name"),
						result.getString("last_name"), result.getString("email"), result.getString("password"));
			}
			result.close();
			prepared.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
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
		sql = "SELECT * FROM student WHERE first_name=?";
		try {
			connection = datasource.getConnection();
			PreparedStatement prepared;
			prepared = connection.prepareStatement(sql);
			prepared.setString(1, first_name);
			ResultSet result = prepared.executeQuery();
			if (result.next()) {
				student = new Student(result.getInt("id"), result.getString("first_name"),
						result.getString("last_name"), result.getString("email"), result.getString("password"));
			}
			result.close();
			prepared.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
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
		sql = "SELECT * FROM student WHERE email=?";
		try {
			connection = datasource.getConnection();
			PreparedStatement prepared;
			prepared = connection.prepareStatement(sql);
			prepared.setString(1, email);
			ResultSet result = prepared.executeQuery();
			if (result.next()) {
				student = new Student(result.getInt("id"), result.getString("first_name"),
						result.getString("last_name"), result.getString("email"), result.getString("password"));
			}
			result.close();
			prepared.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		return student;
	}



	public void writerResult(Student student) {

		System.out.println(student.getId() + " : " + student.getFirst_name() + " " + student.getLast_name() + " "
				+ student.getEmail() + " " + student.getPassword());
	}

	public List<Student> getAllStudent() {
		
		List<Student> StudentList=new ArrayList<Student>();
		String sql="SELECT * FROM student";
		try {
			connection = datasource.getConnection();
			PreparedStatement prepared;
			prepared = connection.prepareStatement(sql);
			ResultSet rs=prepared.executeQuery();
			
			while(rs.next() ){
				Student student=new Student();
				student.setId(rs.getInt("id"));
				student.setFirst_name(rs.getString("first_name"));
				student.setLast_name(rs.getString("last_name"));
				student.setEmail(rs.getString("email"));
				student.setPassword(rs.getString("password"));
				StudentList.add(student);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return StudentList;
	}

	public void updateStudent(Student student, int id) {
		sql = "UPDATE student SET first_name=?, last_name=?, email=?, password=? WHERE id=?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
		Object[] args = new Object[] { student.getFirst_name(), student.getLast_name(), student.getEmail(),
				student.getPassword(), id };
		int status = jdbcTemplate.update(sql, args);

		if (status != 0) {
			System.out.println("kayıt basarili. id :  " + id);
		} else {
			System.out.println("kayıt basarisiz. id :  " + id);

		}

	}
	
	public void deleteStudent(int id){
		String sql="DELETE FROM student WHERE id=?";
		try {
			connection = datasource.getConnection();
			PreparedStatement prepared;
			prepared = connection.prepareStatement(sql);
			prepared.setInt(1, id);
			int status=prepared.executeUpdate();
			if(status != 0){
				System.out.println("data silindi");
			}else{
				System.out.println("data silinemedi");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

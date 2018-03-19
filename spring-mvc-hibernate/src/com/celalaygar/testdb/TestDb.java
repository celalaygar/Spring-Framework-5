package com.celalaygar.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDb
 */
@WebServlet("/TestDb")
public class TestDb extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestDb() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user="root";
		String pass="";
		
		String jdbc="jdbc:mysql://localhost:3306/ogrenci_schema?useSSL=false";
		String driver="com.mysql.jdbc.Driver";
		
		try {
			PrintWriter writer=response.getWriter();
			
			writer.println("veritabanýna baglantý : "+jdbc);
			Class.forName(driver);
			
			Connection myConn=DriverManager.getConnection(jdbc,user,pass);
			
			writer.println("<br/>     basarili");
			myConn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException();
		}
		
		

		
		
	}

}

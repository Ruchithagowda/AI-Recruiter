package com.java.ai.pdfparser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/ai_recruitment";
	
    static final String USER = "root";
    static final String PASS = "";
    
    
    		
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
	Connection conn = null;
	//Statement stat = null;
	
	try {
		Class.forName(JDBC_DRIVER);
		
		System.out.println("Connecting to database");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		
		
		System.out.println("Inserting values....");
		//stat = conn.createStatement()
		
		String sql;
		sql = "insert into pdf_crawler values (12,'https://www.sample_url.com')";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();	
	}
	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	}

}


package com.toyota.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	
	

	public static void main(String[] args) {
		//insertData();
		//readData();
		prepareStatementMethod();
	}

	private static void prepareStatementMethod() {
		
		Connection conn = null;
		PreparedStatement prepareStmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345");
		    prepareStmt = conn.prepareCall("select * from person where first_name = ? and last_name = ?");
		    prepareStmt.setString(1, "Suresh");
		    prepareStmt.setString(2, "babu");
		    rs = prepareStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) +" , "+rs.getString("first_name"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			 if(rs != null)
				 rs.close();
			if(prepareStmt != null)
				prepareStmt.close();
			if(conn != null)
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void readData() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345");
		     stmt = conn.createStatement();
			String sql = "select * from  person ";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1) +" , "+rs.getString("first_name"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			 if(rs != null)
				 rs.close();
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void insertData() {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345");
			//System.out.println(conn);
		     stmt = conn.createStatement();
			String sql = "INSERT INTO person (first_name, last_name, birth_date, email)  VALUES ('prem', 'kumar', '1990-01-01', 'prem@example.com')";
			int rowUpdated = stmt.executeUpdate(sql);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

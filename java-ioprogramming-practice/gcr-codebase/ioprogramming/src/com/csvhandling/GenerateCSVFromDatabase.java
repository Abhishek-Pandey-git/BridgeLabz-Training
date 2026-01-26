package com.csvhandling;

import java.io.*;
import java.sql.*;

public class GenerateCSVFromDatabase {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
		String password = "password";
		
		String outputFile = "employee_report.csv";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			
			String query = "SELECT emp_id, name, department, salary FROM employees";
			ResultSet rs = stmt.executeQuery(query);
			
			FileWriter writer = new FileWriter(outputFile);
			
			writer.write("Employee ID,Name,Department,Salary\n");
			
			// write employee data to CSV
			while (rs.next()) {
				writer.write(rs.getString("emp_id") + ",");
				writer.write(rs.getString("name") + ",");
				writer.write(rs.getString("department") + ",");
				writer.write(rs.getString("salary") + "\n");
			}
			
			writer.close();
			rs.close();
			stmt.close();
			conn.close();
			
			System.out.println("CSV report generated successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

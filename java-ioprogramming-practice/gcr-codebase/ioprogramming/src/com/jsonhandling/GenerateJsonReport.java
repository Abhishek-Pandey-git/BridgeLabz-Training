package com.jsonhandling;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class GenerateJsonReport {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "password";
        
        JSONArray reportArray = new JSONArray();
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            
            while (rs.next()) {
                JSONObject employee = new JSONObject();
                employee.put("id", rs.getInt("id"));
                employee.put("name", rs.getString("name"));
                employee.put("department", rs.getString("department"));
                employee.put("salary", rs.getDouble("salary"));
                reportArray.add(employee);
            }
            
            try (FileWriter writer = new FileWriter("employee_report.json")) {
                writer.write(reportArray.toJSONString());
                System.out.println("JSON report generated successfully!");
                System.out.println("Total records: " + reportArray.size());
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}

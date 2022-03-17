package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
	String sql = "select * from login where uname =? and pass = ?";
	String url = "jdbc:mysql://localhost:3306/cloudcomputing";
	String username = "root";
	String password = " ";
	public void insert(String empid,String pass, String fname, String lname, String dob, String contact){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			   
			PreparedStatement ps=con.prepareStatement("insert into ninad_111915079_detail values ('" + empid + "','" + pass + "','" + fname + "','" + lname + "','" + dob + "','" + contact + "')");   
			      
			ResultSet rs=ps.executeQuery();  

		}
		catch(Exception e){
			System.out.println(e);
		}  
	}  
	
}

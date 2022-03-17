package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	String sql = "select * from ninad_111915079_detail where Employee_ID_Number=? and password=?";
	String url = "jdbc:mysql://localhost:3306/cloudcomputing";
	String username = "root";
	String password = " ";
	public boolean validate(String empid,String pass){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			   
			PreparedStatement ps=con.prepareStatement(sql);  
			ps.setString(1,empid);  
			ps.setString(2,pass);  
			      
			ResultSet rs=ps.executeQuery();  
			if(rs.next()) {
				return true;
			}
		          
		}
		catch(Exception e){
			System.out.println(e);
		}  
		return false;  
	} 
	
}

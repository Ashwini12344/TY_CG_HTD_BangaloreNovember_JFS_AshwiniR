package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class UserLogin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
	
		try {
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("driver loaded");
		//get dbconnection via driver
		String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		String dbUser=sc.nextLine();
		String dbPass=sc.nextLine();
		conn=DriverManager.getConnection(dbUrl,dbUser,dbPass);
		System.out.println("connection established");
		//issue sql query
		//String query="SELECT * FROM user_info where userid=2019001 AND password='quert12'";
		//stmt=conn.createStatement();
		//rs=stmt.executeQuery(query);
		//System.out.println("query issued and executed");
		//process
		String query="SELECT * FROM user_info where userid=? AND password=?";
		pstmt=conn.prepareStatement(query);
		System.out.println("enter userid");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("enter password");
		pstmt.setString(2,sc.nextLine());
		rs=pstmt.executeQuery();
		System.out.println("query issued and executed");
		System.out.println("******************");
		if(rs.next()) {
			System.out.println("userid:"+rs.getInt(1));
			System.out.println("Username:"+rs.getString(2));
			System.out.println("Email:"+rs.getString(3));
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
		//close all JDBC objects
				finally {
					try {
					if(conn!=null) 
						conn.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
					try {
						if(pstmt!=null) 
							pstmt.close();
						}catch(SQLException e) {
							e.printStackTrace();
						}
					try {
						if(rs!=null) 
							rs.close();
						}catch(SQLException e) {
							e.printStackTrace();
						}
				}
		

}
}

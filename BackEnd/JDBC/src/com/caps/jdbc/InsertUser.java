package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//load the driver
		try {
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			//get the dbConnection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter DB user and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("connection established");
			String query="INSERT INTO user_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter username");
			pstmt.setString(2,sc.nextLine());
			System.out.println("enter email");
			pstmt.setString(3,sc.nextLine());
			System.out.println("enter password");
			pstmt.setString(4,sc.nextLine());

			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("user inserted");
			}
			else {
				System.err.println("something went wrong");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

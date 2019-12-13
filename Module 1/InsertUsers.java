package com.capgemini.phoneapp.controller;

	import java.sql.Connection;
	import java.sql.Driver;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

import com.capgemini.phoneapp.bean.ContactBean;

	public class InsertUsers {
		public static  void insert(ContactBean bean) {
			Scanner sc=new Scanner(System.in);
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				Driver driver=new com.mysql.jdbc.Driver();
				DriverManager.registerDriver(driver);
				String dbUrl="jdbc:mysql://127.0.0.1:3306/ContactFile";
				System.out.println("Enter DB user and password");
				String user=sc.nextLine();
				String password=sc.nextLine();
				conn=DriverManager.getConnection(dbUrl,user,password);
				//System.out.println("connection established");
				String query="INSERT INTO Contact values(?,?,?)";
				pstmt=conn.prepareStatement(query);
				System.out.println("enter contactName");
				pstmt.setString(1,sc.nextLine());
				System.out.println("enter contact number");
				pstmt.setString(2,sc.nextLine());
				System.out.println("enter contact group");
				pstmt.setString(3,sc.nextLine());
				

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

	


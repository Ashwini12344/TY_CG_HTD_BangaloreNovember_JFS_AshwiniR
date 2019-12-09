package com.caps.jdbc;
import java.sql.Connection;
import java.util.Scanner;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		//load the drive
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		
		//get the db connectgion
		String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		System.out.println("Enter DB user and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		conn=DriverManager.getConnection(dbUrl,user,password);
		System.out.println("connection established");
		
		//issue sql query
		String query="update user_info set email=? where userid=? and password=?";
		pstmt=conn.prepareStatement(query);
		System.out.println("enter userid");
		pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
		System.out.println("enter new email");
		pstmt.setString(1,sc.nextLine());
		System.out.println("enter password to update");
		pstmt.setString(3,sc.nextLine());
		
		int count=pstmt.executeUpdate();
		System.out.println("the query has been issued");
		
		if (count>0)
		{
			System.out.println("query OK,"+count+" Rows affected");
		}
		else {
			System.err.println("Something went wrong");
		}
		
		
		//process  the sql query
		
		
		//close the jdbc objects
		}catch(Exception e) {
			e.printStackTrace();
		}
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
			


	
}

}
}

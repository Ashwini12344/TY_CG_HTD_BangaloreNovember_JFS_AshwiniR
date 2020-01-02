package com.capgemini.forestjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.capgemini.forestjdbc.bean.ContractBean;
import com.capgemini.forestjdbc.bean.CustomerBean;
import com.capgemini.forestjdbc.exception.ForestException;

	public class CustomerDAOImpl implements CustomerDAO {
		FileReader reader;
		Properties prop;

		public CustomerDAOImpl() {
			try {
				reader=new FileReader("db.properties");
				prop=new Properties();
				prop.load(reader);
				Class.forName(prop.getProperty("driverClass"));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public boolean addCustomer(CustomerBean bean) {
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("addCustomerQuery")); ){
			pstmt.setInt(1,bean.getCustid());
			pstmt.setString(2, bean.getCustname());
			pstmt.setString(3,bean.getStreetAddress1());
			pstmt.setString(4, bean.getStreetAddress2());
			pstmt.setString(5, bean.getTown());
			pstmt.setString(6, bean.getPostalcode());
			pstmt.setString(7, bean.getEmail());
			pstmt.setString(8, bean.getTelno());
			
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}}catch(Exception e) {
				e.printStackTrace();
			}
			return false;
		
	}
				
	
		@Override
		public boolean deleteCustomer(int custid) {
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteCustomerQuery")); ){	
				pstmt.setInt(1, custid);
				
				int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			else {
				return false;
				//System.err.println("something went wrong");
			}
			}catch(Exception e) {
				e.printStackTrace();
			}

			return false;
		}
				
				
				

		@Override
	public boolean modifyCustomer(int custid,String email) {
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("modifyCustomerQuery")); ){	
				pstmt.setInt(1,custid);
				pstmt.setString(7,email);
		
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("user updated");
			}
			else {
				System.err.println("something went wrong");
			}
			
		}catch(Exception e) {
			
		}
		return false;
	}
	}


	
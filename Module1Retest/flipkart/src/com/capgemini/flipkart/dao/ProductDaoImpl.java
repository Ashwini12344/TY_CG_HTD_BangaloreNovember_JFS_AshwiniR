package com.capgemini.flipkart.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.Properties;

import com.capgemini.flipkart.beans.ProductBean;
import com.mysql.jdbc.PreparedStatement;

public class ProductDaoImpl implements ProductDao {
	FileReader reader;
	static Properties prop;
	static ProductBean user;
	public ProductDaoImpl(){

		try {
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public  List<ProductBean> showProduct() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){

			while(rs.next()) {
				user=new ProductBean();
				user.setProduct_id(rs.getInt(1));
				user.setProduct_name(rs.getString(2));
				user.setProduct_cost(rs.getDouble(3));
				user.setProduct_category(rs.getString(4));
				user.setProduct_description(rs.getString(5));
				user.setNumber_of_products(rs.getInt(6));
				list.add(user);
			}
			return list;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	
	
	}
		

	
	public  boolean searchProduct(String name) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(prop.getProperty("querySearch"));){
			pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				user=new ProductBean();
				System.out.println(rs.getInt("number"));
				return true;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		return false;
	}
		
		
		

	public  boolean buyProduct(long cardnum, int cvv) {
		// TODO Auto-generated method stub
		return false;
	}
	

	

}

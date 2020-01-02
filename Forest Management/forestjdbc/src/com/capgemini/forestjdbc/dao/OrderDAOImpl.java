package com.capgemini.forestjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forestjdbc.bean.ContractBean;
import com.capgemini.forestjdbc.bean.OrderBean;

public class OrderDAOImpl  implements OrderDAO{
	FileReader reader;
	Properties prop;
	OrderBean order;
	public OrderDAOImpl(){

		try {
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public List<OrderBean> showOrder() {
		List<OrderBean> list=new ArrayList<OrderBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbpassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query4"))){

			while(rs.next()) {
				order=new OrderBean();
				order.setCustid(rs.getInt(1));
				order.setHaulid(rs.getInt(2));
				order.setProdid(rs.getInt(3));
				order.setOrderno(rs.getInt(4));
				order.setDeliverydate(rs.getString(5));
				order.setQuantity(rs.getInt(6));
				list.add(order);
			}
			return list;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}
			

	@Override
	public boolean addOrder(OrderBean order) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("addOrderQuery")); ){
			pstmt.setInt(1, order.getCustid());
			pstmt.setInt(2, order.getHaulid());
			pstmt.setInt(3, order.getProdid());
			pstmt.setInt(4, order.getOrderno());
			pstmt.setString(5, order.getDeliverydate());
			pstmt.setInt(6,order. getQuantity());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteOrder(int orderno) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteOrderQuery")); ){	
			pstmt.setInt(1, orderno);
			
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
	}



package com.capgemini.phoneapp.dao;

import java.util.List;
import java.util.Properties;

import com.capgemini.phoneapp.bean.ContactBean;
import com.mysql.jdbc.Statement;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContactDAOImp implements ContactDAO {
		FileReader reader;
		Properties prop;
		ContactBean user;
		public ContactDAOImp() {
			try {
				reader=new FileReader("/phoneapp/src/db.properties");
				prop=new Properties();
				prop.load(reader);
				Class.forName(prop.getProperty("driverClass"));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		public  List<ContactBean> getContact() {
			List<ContactBean> list=new ArrayList<ContactBean>();
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));Statement stmt=(Statement) conn.createStatement(); ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
				
			while(rs.next()) {
				ContactBean bean = new ContactBean();
				bean.setName(rs.getString(1));
				bean.setNumber(rs.getLong(2));
					bean.setGroup(rs.getString(3));
					list.add(bean);
				}
			return list;
			}catch(Exception e) {
				e.printStackTrace();

			}

			return null;
		}

		@Override
		public boolean search(String name) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean operate(ContactBean bean) {
			// TODO Auto-generated method stub
			return false;
		}

		

}

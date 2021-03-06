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

public class ContractDAOImpl implements ContractDAO {
	FileReader reader;
	Properties prop;

	public ContractDAOImpl() {
		try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addContractor(ContractBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("addContractQuery"));) {

			pstmt.setInt(1, bean.getCustid());
			pstmt.setInt(2, bean.getContractno());
			pstmt.setInt(6, bean.getProdid());
			pstmt.setInt(5, bean.getHaulid());
			pstmt.setString(3, bean.getDeliverydate());
			pstmt.setString(4, bean.getDeliveryday());
			pstmt.setInt(7, bean.getQuantity());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteContractor(int contractNo) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteContractQuery"))) {
			pstmt.setInt(1, contractNo);

			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} else {
				return false;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public List<ContractBean> showContract() {
		List<ContractBean> list = new ArrayList<ContractBean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))) {

			while (rs.next()) {
				ContractBean contract = new ContractBean();
				contract.setContractno(rs.getInt(2));
				contract.setCustid(rs.getInt(1));
				contract.setHaulid(rs.getInt(5));
				contract.setProdid(rs.getInt(6));
				contract.setDeliverydate(rs.getString(3));
				contract.setDeliveryday(rs.getString(4));
				contract.setQuantity(rs.getInt(7));
				list.add(contract);
			}
			return list;
		} catch (Exception e) {
			e.getStackTrace();
		}
		return null;

	}

}

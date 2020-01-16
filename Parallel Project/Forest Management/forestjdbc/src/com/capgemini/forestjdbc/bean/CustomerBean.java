package com.capgemini.forestjdbc.bean;

import java.io.Serializable;

public class CustomerBean implements Serializable {
	private int custid;
	private String custname;
	private String streetAddress1;
	private String  streetAddress2;
	private String town;
	private String postalcode;
	private String email;
	private String Telno;
	
	
	@Override
	public String toString() {
		return "CustomerBean [custid=" + custid + ", custname=" + custname + ", streetAddress1=" + streetAddress1
				+ ", streetAddress2=" + streetAddress2 + ", town=" + town + ", postalcode=" + postalcode + ", email="
				+ email + ", Telno=" + Telno + "]";
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getStreetAddress1() {
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String pin) {
		this.postalcode = pin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelno() {
		return Telno;
	}
	public void setTelno(String tel) {
		this.Telno = tel;
	}
	

}

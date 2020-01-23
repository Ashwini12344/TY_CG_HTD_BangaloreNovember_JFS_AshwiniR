package com.capgemini.forestcollection.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable {

	private int custId;
	private String custName;
	private String streetAddress1;
	private String streetAddress2;
	private String town;
	private String postalcode;
	private String email;
	private String Telno;

	public int getCustid() {
		return custId;
	}

	public void setCustid(int custId) {
		this.custId = custId;
	}

	public String getCustname() {
		return custName;
	}

	public void setCustname(String custName) {
		this.custName = custName;
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
		Telno = tel;
	}

	@Override
	public String toString() {
		return "CustomerBean [custid=" + custId + ", custname=" + custName + ", streetAddress1=" + streetAddress1
				+ ", streetAddress2=" + streetAddress2 + ", town=" + town + ", postalcode=" + postalcode + ", email="
				+ email + ", Telno=" + Telno + "]";
	}

}

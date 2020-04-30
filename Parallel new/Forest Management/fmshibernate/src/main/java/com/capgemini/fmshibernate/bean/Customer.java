package com.capgemini.fmshibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
public class Customer {
	@Id
	@Column
	private int customerid;
	@Column
	private String customerName;
	@Column
	private String streetAddress1;
	@Column
	private String streetAddress2;
	@Column
	private String town;
	@Column
	private String postalcode;
	@Column
	private String email;
	@Column
	private String telephone;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomer_name() {
		return customerName;
	}

	public void setCustomer_name(String customerName) {
		this.customerName = customerName;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetaddress2() {
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

	public void setPostal_code(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customer_name=" + customerName + ", streetAddress1="
				+ streetAddress1 + ", street_address2=" + streetAddress1 + ", town=" + town + ", postalcode="
				+ postalcode + ", email=" + email + ", telephone=" + telephone + "]";
	}

}
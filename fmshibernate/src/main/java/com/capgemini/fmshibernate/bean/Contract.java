package com.capgemini.fmshibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contract_info")
public class Contract {
	@Column
	private int contract_no;
	@Id
	@Column
	private int customerid;
	@Column
	private int haulid;
	@Override
	public String toString() {
		return "Contract [contract_no=" + contract_no + ", customerid=" + customerid + ", haulid=" + haulid
				+ ", productid=" + productid + ", quantity=" + quantity + ", delivery_date=" + delivery_date
				+ ", delivery_dat=" + delivery_day + "]";
	}
	@Column
	private int productid;
	@Column
	private int quantity;
	@Column
	private String delivery_date;
	@Column
	private String delivery_day;
	public int getContract_no() {
		return contract_no;
	}
	public void setContract_no(int contract_no) {
		this.contract_no = contract_no;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getHaulid() {
		return haulid;
	}
	public void setHaulid(int haulid) {
		this.haulid = haulid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	public String getDelivery_day() {
		return delivery_day;
	}
	public void setDelivery_day(String delivery_day) {
		this.delivery_day = delivery_day;
	}
	
}

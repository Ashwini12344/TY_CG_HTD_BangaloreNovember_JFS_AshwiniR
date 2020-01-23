package com.capgemini.forestcollection.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContractBean implements Serializable {
	private int contractNo;
	private int custId;
	private int haulId;
	private int prodId;
	private int quantity;
	private String deliveryDate;

	public int getContractno() {
		return contractNo;
	}

	public void setContractno(int contractno) {
		this.contractNo = contractno;
	}

	public int getCustid() {
		return custId;
	}

	public void setCustid(int custid) {
		this.custId = custid;
	}

	public int getHaulid() {
		return haulId;
	}

	public void setHaulid(int haulid) {
		this.haulId = haulid;
	}

	public int getProdid() {
		return prodId;
	}

	public void setProdid(int prodid) {
		this.prodId = prodid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDeliverydate() {
		return deliveryDate;
	}

	public void setDeliverydate(String deliverydate) {
		this.deliveryDate = deliverydate;
	}

	

	@Override
	public String toString() {
		return "ContractBean [contractno=" + contractNo + ", custid=" + custId + ", haulid=" + haulId + ", prodid="
				+ prodId + ", quantity=" + quantity + ", deliverydate=" + deliveryDate + 
				"]";
	}

}

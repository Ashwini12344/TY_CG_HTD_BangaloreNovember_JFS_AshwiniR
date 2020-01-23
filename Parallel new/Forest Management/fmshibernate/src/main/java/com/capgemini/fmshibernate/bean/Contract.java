package com.capgemini.fmshibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class Contract {
	@Id
	@Column
	private int contractNo;
	@Column
	private int customerId;
	@Column
	private int haulId;
	@Column
	private int productId;
	@Column
	private int quantity;
	@Column
	private String deliveryDate;

	public int getContractNo() {
		return contractNo;
	}

	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}

	public int getCustomerid() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getHaulId() {
		return haulId;
	}

	public void setHaulId(int haulId) {
		this.haulId = haulId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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
		return "Contract [contractno=" + contractNo + ", customerid=" + customerId + ", haulId=" + haulId
				+ ", productid=" + productId + ", quantity=" + quantity + ", deliveryDate=" + deliveryDate + ",  ]";
	}

}

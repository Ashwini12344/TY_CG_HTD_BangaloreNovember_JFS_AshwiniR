package com.capgemini.forestcollection.bean;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private int prodId;
	private String prodName;
	private String prodDescription;
	private double cost; 
	public String getProdDescription() {
		return prodDescription;
	}
	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "ProductBean [prodId=" + prodId + ", prodName=" + prodName + "]";
	}
	

}

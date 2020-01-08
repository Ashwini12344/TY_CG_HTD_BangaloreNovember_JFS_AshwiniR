package com.capgemini.forestjdbc.bean;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private int prodId;
	private String prodName;
	
	@Override
	public String toString() {
		return "ProductBean [prodId=" + prodId + ", prodName=" + prodName + "]";
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


}

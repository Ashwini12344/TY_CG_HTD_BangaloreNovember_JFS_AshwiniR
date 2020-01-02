package com.cg.forest.bean;

public class ProductBean {
	private int prodId;
	private String prodName;
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

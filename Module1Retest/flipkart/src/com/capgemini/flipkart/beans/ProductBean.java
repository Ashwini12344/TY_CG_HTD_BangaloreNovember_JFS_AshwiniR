package com.capgemini.flipkart.beans;

import java.io.Serializable;

public class ProductBean implements Serializable{
	private int product_id;
	private String product_name;
	private double product_cost;
	private String product_category;
	private String product_description;
	private int number_of_products;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_cost() {
		return product_cost;
	}
	public void setProduct_cost(double product_cost) {
		this.product_cost = product_cost;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public int getNumber_of_products() {
		return number_of_products;
	}
	public void setNumber_of_products(int number_of_products) {
		this.number_of_products = number_of_products;
	}
	
	
	

}

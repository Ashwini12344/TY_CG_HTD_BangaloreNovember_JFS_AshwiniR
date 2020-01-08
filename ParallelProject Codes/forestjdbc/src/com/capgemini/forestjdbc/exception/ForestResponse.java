package com.capgemini.forestjdbc.exception;

import java.util.List;

import com.capgemini.forestjdbc.bean.CustomerBean;

public class ForestResponse {
	private int statuscode;
	private String message;
	private String description;
	private List<CustomerBean> beans;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<CustomerBean> getBeans() {
		return beans;
	}
	public void setBeans(List<CustomerBean> beans) {
		this.beans = beans;
	}
	

}

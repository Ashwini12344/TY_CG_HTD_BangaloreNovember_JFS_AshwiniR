package com.capgemini.retailer.dto;

import java.util.List;

import lombok.Data;
@Data
public class RetailResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<UserInfo> user;
	private List<ProductInfo> product;
	private List<OrderInfo> order;

}

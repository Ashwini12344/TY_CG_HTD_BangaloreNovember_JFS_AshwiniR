package com.capgemini.forestmgtboot.dto;

import java.util.List;

import lombok.Data;
@Data
public class ProductResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<ProductBean> bean;
}

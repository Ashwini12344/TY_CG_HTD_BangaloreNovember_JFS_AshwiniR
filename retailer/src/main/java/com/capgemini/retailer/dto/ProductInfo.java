package com.capgemini.retailer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product_info")
public class ProductInfo {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private int user_id;
	@Column(unique = true, nullable = false)
	private String name;
	@Column
	private int quantity;
	@Column
	private String details;
	//@JoinColumn(name="user_id",referencedColumnName="id")

}

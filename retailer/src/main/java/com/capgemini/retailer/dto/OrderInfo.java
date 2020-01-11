package com.capgemini.retailer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_info")
public class OrderInfo {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private int product_id;
	@Column
	private int user_id;

}

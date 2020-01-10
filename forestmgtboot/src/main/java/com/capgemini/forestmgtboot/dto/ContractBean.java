package com.capgemini.forestmgtboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contract_info")
public class ContractBean {
	@Column
	private int contract_no;
	@Id
	@Column
	private int customerid;
	@Column
	private int haulid;
	@Column
	private int productid;
	@Column
	private int quantity;
	@Column
	private String delivery_date;
	@Column
	private String delivery_day;
}
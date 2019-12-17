package com.capgemini.mapping.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_otherinfo")
public class EmployeeOther {
	@Id
	@Column
	private int id;
	@Column
	private String passport;
	@Column
	private String fname;
	@Column
	private String mname;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee empInfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Employee getEmpInfo() {
		return empInfo;
	}
	public void setEmpInfo(Employee empInfo) {
		this.empInfo = empInfo;
	}
	
	

}

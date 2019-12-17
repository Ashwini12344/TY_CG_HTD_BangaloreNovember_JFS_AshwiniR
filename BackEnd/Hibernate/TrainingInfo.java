package com.capgemini.mapping.manytomany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.mapping.onetoone.Employee;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="TrainingInfo")
public class TrainingInfo {
	@Id
	@Column
	private int tid;
	@Column
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="training_employee",joinColumns=@JoinColumn(name="tid"),
inverseJoinColumns=@JoinColumn(name="eid"))
private List<Employee> emp;
	

}

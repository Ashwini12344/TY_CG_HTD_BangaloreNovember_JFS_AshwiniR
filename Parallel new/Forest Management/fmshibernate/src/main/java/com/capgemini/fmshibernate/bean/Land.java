package com.capgemini.fmshibernate.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "land")
public class Land  {
	@Id
	@Column
	private int landId;
	@Column
	private String landLoc;
	@Column
	private int landVal;
	@Column
	private String acqDate;

}

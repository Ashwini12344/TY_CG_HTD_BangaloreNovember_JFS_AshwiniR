package com.capgemini.fmshibernate.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="land")
public class LandBean implements Serializable {
		@Id
		@Column
		private int landId;	
		@Id
		private String landLoc;
		@Id
		private int landVal;
		@Id
		private String acqDate;
//		public String toString() {
//			return "  landId = " + landId + "\n landLocation = " + landLoc + "\n landValue = " + landVal
//					+ "\n Date = " + acqDate + "\n";
//		}
	}



package com.capgemini.forestcollection.bean;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class LandBean implements Serializable {
	private int landId;
	private String landLoc;
	private int landVal;
	private String acqDate;

	public String toString() {
		return "  landId = " + landId + "\n landLocation = " + landLoc + "\n landValue = " + landVal + "\n Date = "
				+ acqDate + "\n";
	}
}

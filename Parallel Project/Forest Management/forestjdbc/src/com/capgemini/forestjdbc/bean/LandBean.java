package com.capgemini.forestjdbc.bean;

import java.io.Serializable;

public class LandBean implements Serializable {
		private int landId;	
		private String landLoc;
		private int landVal;
		private String acqDate;
		public int getLandId() {
			return landId;
		}
		public void setLandId(int landId) {
			this.landId = landId;
		}
		public String getLandLoc() {
			return landLoc;
		}
		public void setLandLoc(String landLoc) {
			this.landLoc = landLoc;
		}
		public int getLandVal() {
			return landVal;
		}
		public void setLandVal(int landVal) {
			this.landVal = landVal;
		}
		public String getAcqDate() {
			return acqDate;
		}
		public void setAcqDate(String acqDate) {
			this.acqDate = acqDate;
		}
		@Override
		public String toString() {
			return " landId=" + landId + ", landLoc=" + landLoc + ", landVal=" + landVal + ", acqDate="
					+ acqDate + "\n";
		}
		
	}



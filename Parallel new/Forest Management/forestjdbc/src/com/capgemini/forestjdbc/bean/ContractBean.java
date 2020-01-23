package com.capgemini.forestjdbc.bean;

import java.io.Serializable;

public class ContractBean implements Serializable {
	    private int contractNo;
	    private int custId;
	    private int haulId;
	    private int prodId;
	    private int quantity;
	    private String deliveryDate;
	    
		@Override
		public String toString() {
			return "ContractBean [contractno=" + contractNo + ", custid=" + custId + ", haulid=" + haulId + ", prodid="
					+ prodId + ", quantity=" + quantity + ", deliverydate=" + deliveryDate + "]";
		}
		public int getContractNo() {
			return contractNo;
		}
		public void setContractNo(int contractNo) {
			this.contractNo = contractNo;
		}
		public int getCustid() {
			return custId;
		}
		public void setCustid(int custid) {
			this.custId = custid;
		}
		public int getHaulid() {
			return haulId;
		}
		public void setHaulid(int haulId) {
			this.haulId = haulId;
		}
		public int getProdid() {
			return prodId;
		}
		public void setProdid(int prodid) {
			this.prodId = prodid;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getDeliverydate() {
			return deliveryDate;
		}
		public void setDeliverydate(String deliveryDate) {
			this.deliveryDate = deliveryDate;
		}
		

}

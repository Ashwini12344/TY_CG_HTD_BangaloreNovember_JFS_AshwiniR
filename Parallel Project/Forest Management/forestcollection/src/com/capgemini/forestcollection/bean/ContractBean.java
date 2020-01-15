package com.capgemini.forestcollection.bean;

import java.io.Serializable;

public class ContractBean implements Serializable {
	 private int contractno;
	    private int custid;
	    private int haulid;
	    private int prodid;
	    private int quantity;
	    private String deliverydate;
	    private String deliveryday;
		public int getContractno() {
			return contractno;
		}
		public void setContractno(int contractno) {
			this.contractno = contractno;
		}
		public int getCustid() {
			return custid;
		}
		public void setCustid(int custid) {
			this.custid = custid;
		}
		public int getHaulid() {
			return haulid;
		}
		public void setHaulid(int haulid) {
			this.haulid = haulid;
		}
		public int getProdid() {
			return prodid;
		}
		public void setProdid(int prodid) {
			this.prodid = prodid;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getDeliverydate() {
			return deliverydate;
		}
		public void setDeliverydate(String deliverydate) {
			this.deliverydate = deliverydate;
		}
		public String getDeliveryday() {
			return deliveryday;
		}
		public void setDeliveryday(String deliveryday) {
			this.deliveryday = deliveryday;
		}
		@Override
		public String toString() {
			return "ContractBean [contractno=" + contractno + ", custid=" + custid + ", haulid=" + haulid + ", prodid="
					+ prodid + ", quantity=" + quantity + ", deliverydate=" + deliverydate + ", deliveryday="
					+ deliveryday + "]";
		}
		

}
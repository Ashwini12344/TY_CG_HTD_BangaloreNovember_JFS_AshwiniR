package com.capgemini.forestjdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forestjdbc.bean.ContractBean;
import com.capgemini.forestjdbc.bean.ProductBean;
import com.capgemini.forestjdbc.factory.Factory;
import com.capgemini.forestjdbc.main.ForestApplication;
import com.capgemini.forestjdbc.services.*;
public class ContractDetails{
	public static void contractDetails() {
		 Scanner sc=new Scanner(System.in);
		 ContractServices service=Factory.instanceOfContractServices();
		while(true) {
			System.out.println("1.Add Contract Details");
			System.out.println("2.Delete Contract details");
			System.out.println("3.Show Contract");
			System.out.println("4.Back");
			int ch1=sc.nextInt();
			ContractBean bean=new ContractBean();
			switch(ch1) {
						case 1:System.out.println("enter Contract no");
								int contractno=sc.nextInt();
								System.out.println("enter customer-id");
								int custid=sc.nextInt();
								System.out.println("enter product-id");
								int prodid=sc.nextInt();
								System.out.println("enter Haulier-id");
								int haulid=sc.nextInt();
								System.out.println("enter delivery date");
								String deliverydate=sc.next();
								while(!deliverydate.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{2,4}+")) {
									System.err.println("Enter valid date");
									deliverydate=sc.next();
									
								}
								System.out.println("enter delivery day");
								String deliveryday=sc.next();
								System.out.println("enter quantity");
								int quantity=sc.nextInt();
								bean.setContractno(contractno);
								bean.setCustid(custid);
								bean.setProdid(prodid);
								bean.setHaulid(haulid);
								bean.setDeliverydate(deliverydate);
								bean.setQuantity(quantity);
								bean.setDeliveryday(deliveryday);
								boolean check=service.addContractor(bean);
								if(check) {
									System.out.println("contractor added");
									System.out.println(bean.toString());
								}
								break;
							case 2:System.out.println("Enter contractno");
								int contractNo=sc.nextInt();
								boolean check1=service.deleteContractor(contractNo);
									if(check1) {
									System.out.println("USER DELETED");
									}
								else {
									System.err.println("NO USER FOUND");
								}
								break;
							case 3:List<ContractBean> check2=service.showContract();
						      System.out.println(check2);
							break;
							case 4:ForestApplication.main(null);
									break;
				}
}
	}
}




package com.capgemini.fmshibernate.details;

import java.util.List;
import java.util.Scanner;

import com.capgemini.fmshibernate.bean.Contract;
import com.capgemini.fmshibernate.controller.ForestMain;
import com.capgemini.fmshibernate.service.ContractService;
import com.capgemini.fmshibernate.service.ContractServiceImpl;

public class ContractDetails{
	public static void contractDetails() {
		 Scanner sc=new Scanner(System.in);
		 ContractService service=new ContractServiceImpl();
		while(true) {
			System.out.println("1.Add Contract Details");
			System.out.println("2.Delete Contract details");
			System.out.println("3.Show Contract");
			System.out.println("4.Back");
			int ch1=sc.nextInt();
			Contract bean=new Contract();
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
								bean.setContract_no(contractno);
								bean.setCustomerid(custid);
								bean.setProductid(prodid);
								bean.setHaulid(haulid);
								bean.setDelivery_date(deliverydate);
								bean.setQuantity(quantity);
								bean.setDelivery_day(deliveryday);
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
							case 3:List<Contract> check2=service.showContract();
						      System.out.println(check2);
							break;
							case 4:ForestMain.main(null);
									break;
				}
}
	}
}




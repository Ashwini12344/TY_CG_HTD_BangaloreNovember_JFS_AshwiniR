package com.capgemini.phoneapp.contact;
import java.util.*;

import com.capgemini.phoneapp.bean.ContactBean;
import com.capgemini.phoneapp.controller.ContactInfo;
import com.capgemini.phoneapp.controller.InsertUsers;
import com.capgemini.phoneapp.dao.ContactDAOImp;

public class TestContact {
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				while(true) {
					System.out.println("Press 1 to show all contacts");
					System.out.println("Press 2 to search for contacts");
					System.out.println("Press 3 to operate on Contact");
					System.out.println("Enter your choice");
					int choice=sc.nextInt();
					switch(choice) {
						case 1:System.out.println("Welcome to Contact page");
						ContactBean bean=new ContactBean();
						InsertUsers.insert(bean);
						//ContactDAOImp dao=new ContactDAOImp();
						//dao.getContact();
								break;
						case 2:System.out.println("Contact search");
								ContactInfo.contactInfo();
							break;
						case 3:System.out.println("Modify data");
							break;
						default:System.out.println("Invalid Choice");
					
						
						
			}

	}
	}
}


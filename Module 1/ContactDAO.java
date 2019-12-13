package com.capgemini.phoneapp.dao;

import java.util.List;

import com.capgemini.phoneapp.bean.ContactBean;

public interface ContactDAO {
	public boolean search(String name);
	public boolean operate(ContactBean bean);
	List<ContactBean> getContact();
	

}

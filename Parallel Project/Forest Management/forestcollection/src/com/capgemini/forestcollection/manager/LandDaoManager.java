package com.capgemini.forestcollection.manager;

import com.capgemini.forestcollection.dao.LandDao;
import com.capgemini.forestcollection.dao.LandDaoImpl;

public class LandDaoManager {
	public static LandDao getLandDao() {
		return new LandDaoImpl();
	}

}

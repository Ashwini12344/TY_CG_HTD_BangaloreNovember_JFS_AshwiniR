package com.capgemini.forestcollection.manager;

import com.capgemini.forestcollection.dao.LandDAO;
import com.capgemini.forestcollection.dao.LandDAOImpl;

public class LandDaoManager {
	public static LandDAO getLandDao() {
		return new LandDAOImpl();
	}

}

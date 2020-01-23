package com.capgemini.forestcollection.manager;

import com.capgemini.forestcollection.dao.SchedulerDAO;
import com.capgemini.forestcollection.dao.SchedulerDAOImpl;

public class SchedulerDAOManager {
	public static SchedulerDAO getSchedulerDAO() {
		return new SchedulerDAOImpl();
	}

}

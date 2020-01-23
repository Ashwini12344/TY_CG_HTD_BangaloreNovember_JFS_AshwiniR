package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Scheduler;
import com.capgemini.fmshibernate.dao.ProductDAO;
import com.capgemini.fmshibernate.dao.ProductDAOImpl;
import com.capgemini.fmshibernate.dao.SchedulerDAO;
import com.capgemini.fmshibernate.dao.SchedulerDAOImpl;

public class SchedulerServiceImpl  implements SchedulerService{
	SchedulerDAO dao=new SchedulerDAOImpl();

	@Override
	public boolean addSchedule(Scheduler bean) {
		return dao.addSchedule(bean);
	}

	@Override
	public boolean modifySchedule(Scheduler sbean) {
		return dao.modifySchedule(sbean);
	}

	@Override
	public boolean deleteSchedule(int scheduleId) {
		return dao.deleteSchedule(scheduleId);
	}

	@Override
	public List<Scheduler> getAllSchedules() {
		return dao.getAllSchedules();
	}

	@Override
	public Scheduler getSchedule(int scheduleId) {
		return dao.getSchedule(scheduleId);
	}

}

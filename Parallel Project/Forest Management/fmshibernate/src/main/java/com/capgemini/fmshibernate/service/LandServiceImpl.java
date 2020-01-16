package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.LandBean;
import com.capgemini.fmshibernate.dao.ContractDAO;
import com.capgemini.fmshibernate.dao.ContractDAOImpl;
import com.capgemini.fmshibernate.dao.LandDao;
import com.capgemini.fmshibernate.dao.LandDaoImpl;


public class LandServiceImpl implements LandServices {
	LandDao dao=new LandDaoImpl();

	@Override
	public List<LandBean> showAllLands() {
		return dao.showAllLands();
	}

	@Override
	public boolean addLand(LandBean land) {
		return dao.addLand(land);
	}

	@Override
	public boolean removeLand(int landId) {
		return dao.removeLand(landId);
	}

}

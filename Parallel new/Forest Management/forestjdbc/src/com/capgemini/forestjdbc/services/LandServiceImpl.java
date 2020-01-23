package com.capgemini.forestjdbc.services;

import java.util.List;

import com.capgemini.forestjdbc.bean.LandBean;
import com.capgemini.forestjdbc.dao.CustomerDAO;
import com.capgemini.forestjdbc.dao.LandDAO;
import com.capgemini.forestjdbc.factory.Factory;

public class LandServiceImpl implements LandServices {
	LandDAO dao=Factory.instanceOfLandDaoImpl();

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

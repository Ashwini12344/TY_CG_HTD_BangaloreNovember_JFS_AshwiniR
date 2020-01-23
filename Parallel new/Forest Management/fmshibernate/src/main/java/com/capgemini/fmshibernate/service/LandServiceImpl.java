package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Land;
import com.capgemini.fmshibernate.dao.ContractDAO;
import com.capgemini.fmshibernate.dao.ContractDAOImpl;
import com.capgemini.fmshibernate.dao.LandDAO;
import com.capgemini.fmshibernate.dao.LandDAOImpl;


public class LandServiceImpl implements LandServices {
	LandDAO dao=new LandDAOImpl();

	@Override
	public List<Land> showAllLands() {
		return dao.showAllLands();
	}

	@Override
	public boolean addLand(Land land) {
		return dao.addLand(land);
	}

	@Override
	public boolean removeLand(int landId) {
		return dao.removeLand(landId);
	}

}

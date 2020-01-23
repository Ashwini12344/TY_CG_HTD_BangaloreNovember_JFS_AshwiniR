package com.capgemini.forestjdbc.dao;

import java.util.List;

import com.capgemini.forestjdbc.bean.LandBean;

public interface LandDAO {
	public List<LandBean> showAllLands();

	public boolean addLand(LandBean land);

	public boolean removeLand(int landId);

}

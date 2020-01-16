package com.capgemini.forestjdbc.services;

import java.util.List;

import com.capgemini.forestjdbc.bean.LandBean;

public interface LandServices {
	public List<LandBean> showAllLands();

	public boolean addLand(LandBean land);

	public boolean removeLand(int landId);

}

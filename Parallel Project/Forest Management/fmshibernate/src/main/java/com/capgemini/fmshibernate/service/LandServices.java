package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.LandBean;


public interface LandServices {
	public List<LandBean> showAllLands();

	public boolean addLand(LandBean land);

	public boolean removeLand(int landId);

}

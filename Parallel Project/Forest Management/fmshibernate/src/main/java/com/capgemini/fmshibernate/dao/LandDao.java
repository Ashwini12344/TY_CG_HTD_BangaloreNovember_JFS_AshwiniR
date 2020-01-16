package com.capgemini.fmshibernate.dao;

import java.util.List;

import com.capgemini.fmshibernate.bean.LandBean;


public interface LandDao {
	public List<LandBean> showAllLands();

	public boolean addLand(LandBean land);

	public boolean removeLand(int landId);

}

package com.capgemini.fmshibernate.dao;

import java.util.List;

import com.capgemini.fmshibernate.bean.Land;


public interface LandDAO {
	public List<Land> showAllLands();

	public boolean addLand(Land land);

	public boolean removeLand(int landId);

}

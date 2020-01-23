package com.capgemini.fmshibernate.service;

import java.util.List;

import com.capgemini.fmshibernate.bean.Land;


public interface LandServices {
	public List<Land> showAllLands();

	public boolean addLand(Land land);

	public boolean removeLand(int landId);

}

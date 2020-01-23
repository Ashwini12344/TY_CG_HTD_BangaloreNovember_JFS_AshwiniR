package com.capgemini.forestcollection.dao;

import com.capgemini.forestcollection.bean.LandBean;

public interface LandDAO {
public void showAllLands();
	
	public boolean addLand(LandBean land);
	
	public boolean modifyLand(int custId,LandBean lbean);

	public boolean removeLand(int custId);
	
	public LandBean searchLand(int custId);
}

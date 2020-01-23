package com.capgemini.forestcollection.dao;

import java.util.HashMap;
import java.util.Set;

import com.capgemini.forestcollection.bean.ContractBean;
import com.capgemini.forestcollection.bean.LandBean;

public class LandDAOImpl implements LandDAO{

	private static HashMap<Integer,LandBean> h1=new HashMap<Integer,LandBean>();
	int lid=0;

	@Override
	public void showAllLands() {
		try{
			System.out.println("Land details");
			Set<Integer> s=h1.keySet();
			for (Integer key : s) {
				System.out.println("LAND-ID: "+key);
				LandBean cb=h1.get(key);
				System.out.println(cb);
			}
		}catch (Exception e) {
			System.err.println("Something went wrong");
		}		
	}


	@Override
	public boolean modifyLand(int landid, LandBean lbean) {
		h1.replace(landid,lbean );
		return true;
	}

	@Override
	public boolean removeLand(int custid) {
		System.out.println("Successfully deleted");
		h1.remove(custid);
		return true;
	}

	@Override
	public boolean addLand(LandBean land) {
		
		while(true) {
			++lid;
			land.setLandId(lid);
			h1.put(lid,land);
			System.out.println("Land with LAND-ID is : "+lid+", added successfully. (please remember)");
			return true;
		}	
	}



	@Override
	public LandBean searchLand(int cid) {
		try {
			if(h1.containsKey(cid)==true) {
				return h1.get(cid);
			}else {
				return null;
			}
		}catch (Exception e) {
			System.err.println("There is problem in Searching..!");
			return null;
		}
	}
}
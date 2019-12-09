package com.capgemini.map.hashmap;
import java.util.Set;
import java.util.Map;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(2, "ramesh");
		h1.put(4,"suresh");
		h1.put(6, "Dinesh");
	     h1.put(8,"ganesh");	
	     Set<Map.Entry<Integer,String>>s1=h1.entrySet();
	     for(Map.Entry<Integer,String>e1:s1) {
	    	 System.out.println(e1.getKey());
	    	 System.out.println(e1.getValue());
	    	 System.out.println("------------------------");
	     }
	}

}

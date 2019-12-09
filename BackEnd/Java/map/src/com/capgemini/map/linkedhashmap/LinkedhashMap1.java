package com.capgemini.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedhashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer>l1=new LinkedHashMap<String,Integer>();
		l1.put("BTM",560098);
		l1.put("Hebbal",67890);
		l1.put("BTR",675438);
		l1.put(null,563117);
		l1.put(null, null);
		Set<Map.Entry<String,Integer>>s1=l1.entrySet();
		for(Map.Entry<String, Integer>e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("---------------------");
			System.out.println(l1.containsKey("BTR"));
		}
		}

}

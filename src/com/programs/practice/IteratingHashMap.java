package com.programs.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratingHashMap {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>(); 
		
		map.put("1", "attitude");
		map.put("2", "Alchemist");
		map.put("3", "5AM club");

		
		for(Map.Entry<String,String> element:map.entrySet()) {
			System.out.println("Key:"+element.getKey()+", "+"Value:"+element.getValue());
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<String, String> m = (Map.Entry<String, String>)it.next();
			System.out.println("Key:"+m.getKey()+", "+"Value:"+m.getValue());

		}
	}
}

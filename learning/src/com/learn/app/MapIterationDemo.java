package com.learn.app;

import java.util.HashMap;
import java.util.Map;

public class MapIterationDemo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> myMap = new HashMap<>();
		
		myMap.put(2, "SANTOSH");
		myMap.put(1, "RAM");
		myMap.put(7, "ABHIS");
		myMap.put(4, "SAMBI");
		
		myMap.forEach( (a,b)->{
			
			System.out.println("KEY "+a+" Value"+b);
		});
		
		
		
		for(int key:myMap.keySet()) {
			System.out.println("KEY==="+key);
		}
		
		for(String value:myMap.values()) {
			System.out.println("VALUE==="+value);
		}
		
		myMap.entrySet().stream().forEachOrdered(a->{
			System.out.println("Order key=="+a.getKey()+" Value=="+a.getValue());
		});
	}

}

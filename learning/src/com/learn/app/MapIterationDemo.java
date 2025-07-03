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
		
		//print key value from a map
		
		myMap.forEach((a,b)->System.out.println("Key "+a+" value "+b));
		//get the key and print it
		for(int key:myMap.keySet()) {
			System.out.println("Key Only "+key);
		}
		
		//get the value and print
		for(String val:myMap.values()) {
			System.out.println("Values "+val);
		}
		
		//get the ordered values
		myMap.entrySet().stream().forEachOrdered(a->System.out.println("Key "+a.getKey()+" val="+a.getValue()));
		
		//*****you cannot get stream directly from the map... you may need entryset
		
	}

}

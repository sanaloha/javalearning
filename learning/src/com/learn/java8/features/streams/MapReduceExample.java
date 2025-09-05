package com.learn.java8.features.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapReduceExample {
	
	
	
	
	public static void main(String[] args) {
		List<Integer> priceList = Arrays.asList(45,67,88,33,8);
		Integer addition=0;
		
		Integer sumTotal = priceList.stream().reduce(0,Integer::sum);
		System.out.println("Total"+sumTotal);
		System.out.println("Multiplication"+priceList.stream().reduce(1, (a,b)->a*b));
		
		//
		System.out.println("Total Elements="+priceList.stream().count());
		System.out.println("Sorted Elements="+priceList.stream().sorted().toList());
		System.out.println("Find Firts="+priceList.stream().findFirst());
		
		
	}
	

}

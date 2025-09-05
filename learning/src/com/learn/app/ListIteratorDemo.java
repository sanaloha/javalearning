package com.learn.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new ArrayList<>();
		name.add("CAPP");
		name.add("EAPP");
		name.add("FAPP");
		name.add("DAPP");
		name.add("HAPP");
		
		
		name.forEach(n->System.out.println("elements="+n));
		//name.forEach(l->System.out.println("list elements=="+l));
		
		toUpperCase();
		List<Integer> input =  Arrays.asList(22,45,33,11,3);
		 toCustomArray(input);

	}
/**
 * Write a method to convert list to Array or
 * Write a method to add list elements to an Array.
 * ***/
	
	public static Integer[] toCustomArray(List<Integer> input) {
		
		if(input == null)
			return new Integer[1];
		
		int size = input.size();
		
		Integer [] arr = new Integer[size];
		//int i=0;
		for(int i=0;i<size;i++) {
			arr[i] = input.get(i);
		}
		System.out.println("Array"+Arrays.deepToString(arr));
		return arr;
	}
	
	public static void toUpperCase() {
		
		//create a list using Arrays.asList		  
		List<String> lowerCaseList = Arrays.asList("java 11 LTS","java 17 LTS","Java 16 LTS","java 21 LTS","java 25 LTS","java 29 LTS");
		//lowerCaseList.forEach(a->System.out.println("List items"+a));
		//convert to uppercase.
		List<String> upperCaseList = lowerCaseList.stream().map(String::toUpperCase).collect(Collectors.toList());
		//upperCaseList.forEach(u->System.out.println("Upper Case Elements="+u));
		System.out.println("Upper Case"+upperCaseList);
		List<String> toLowerCse = upperCaseList.stream().map(String::toLowerCase).toList();
		List<String> reversed = upperCaseList.reversed();
		System.out.println("Reversed"+reversed);
		
		//Remove the last element
		String lastString = reversed.removeLast();
		System.out.println("Last element"+lastString+" modified list="+reversed);
		System.out.println("Initial List="+upperCaseList);
		
		//Observation: remove last removed the element from original list upperCaseList as well
		
		//Task: Sort the list
		//Collections.sort(upperCaseList);
		upperCaseList.sort((a,b)->a.compareTo(b));
		System.out.println("Sorted List="+upperCaseList);
		System.out.println("Sorted List reversed="+reversed);
		Comparator<String> cmp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			
		};
		
		
			
	}
}

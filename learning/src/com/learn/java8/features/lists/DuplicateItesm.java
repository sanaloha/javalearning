package com.learn.java8.features.lists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateItesm {
	
	
	
	public static void main(String[] args) {
		
		//You don't have to import the classes in the same package
		ListQNA qna = new ListQNA();
		
		iterateList();
		
		List<Integer> numList = Arrays.asList(22,33,44,22,55,55);
		
		System.out.println("No Dup Items"+numList.stream().filter(a->(new HashSet().add(a))).collect(Collectors.toSet()));
		
		Set<Integer> dulicateItems = new HashSet<>();
		List<Integer> dpItems = numList.stream().filter(a->!dulicateItems.add(a)).collect(Collectors.toList());
		System.out.println("dpitems"+dpItems);
		
		//remove the duplicate item
		Set<Integer> numSet = numList.stream().collect(Collectors.toSet());
		//numSet.forEach(a->System.out.println(a));
		//All in a single line
		List<Integer> nodupList = numList.stream().collect(Collectors.toSet()).stream().toList();
		System.out.println("No duplicate list items."+nodupList);
		//Identify the duplicate items:
		Set<Integer> noDupSet = new HashSet<>();
		
	List<Integer> dupList = numList.stream().filter(a->!noDupSet.add(a)).collect(Collectors.toList());
	dupList.forEach(a->System.out.println("Duplicate List Items=="+a));	
	
	}
	
	public static void iterateList() {
		
	List<Integer> numList = Arrays.asList(4,5,7);
	
	//System.out.println("List item-"+numList.get(3));
	
	}

}


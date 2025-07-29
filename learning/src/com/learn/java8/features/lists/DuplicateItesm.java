package com.learn.java8.features.lists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateItesm {
	
	
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(22,33,44,22,55,55);
		
		//remove the duplicate item
		Set<Integer> numSet = numList.stream().collect(Collectors.toSet());
		numSet.forEach(a->System.out.println(a));
		
		//Identify the duplicate items:
		Set<Integer> noDupSet = new HashSet<>();
		
	List<Integer> dupList = 	numList.stream().filter(a->!noDupSet.add(a)).collect(Collectors.toList());
	dupList.forEach(a->System.out.println("Duplicate List Items=="+a));	
	}

}

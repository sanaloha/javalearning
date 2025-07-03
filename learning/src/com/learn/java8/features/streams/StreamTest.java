package com.learn.java8.features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = Arrays.asList(45,67,33,44,57,89,78,66);
		
		//Find all the even numbers using map and stream.
		System.out.println(numList.stream().filter(a->a%2 ==0).collect(Collectors.toList()));
		
		List<Integer> graceMark = new ArrayList();
		
		graceMark = numList.stream().map(a->a+7).collect(Collectors.toList());
		
		System.out.println("Grace marks=="+graceMark);
		List<Integer> sortedMarks = numList.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted marks=="+sortedMarks);
		

	}

}

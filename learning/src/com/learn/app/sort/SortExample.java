package com.learn.app.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sorting based on natural Order
		List<Integer> numbList = Arrays.asList(24,77,454,12,55);
		
		System.out.println("before sorting"+numbList);
		
		Collections.sort(numbList);
		System.out.println("after sorting"+numbList);
		
		Comparator<Integer> studComp= (i,j)->{
			if(i%10 > j%10)
			return 1;
			else 
			return -1;
		};
		
		Collections.sort(numbList,studComp);
		System.out.println("after using comparator for sorting"+numbList);
		//create a list of employee and sort them
		
	}

}

class Employee implements Comparable<Employee>{
	int age;
	String name;
	
	public Employee(int age, String name) {
	this.age = age;
	this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.age > o.age)
		return 1;
		
		return -1;
	}
	
	
}


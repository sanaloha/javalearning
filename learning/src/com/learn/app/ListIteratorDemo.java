package com.learn.app;

import java.util.ArrayList;
import java.util.Arrays;
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

	}

	public static void toUpperCase() {
		
		//create a list using Arrays.asList		  
		List<String> lowerCaseList = Arrays.asList("java 11 LTS","java 17 LTS","java 21 LTS","java 25 LTS","java 29 LTS");
		lowerCaseList.forEach(a->System.out.println("List items"+a));
		//convert to uppercase.
		List<String> upperCaseList = lowerCaseList.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		upperCaseList.forEach(u->System.out.println("Upper Case Elements="+u));
		
	
	}
}

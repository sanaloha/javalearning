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
		name.add("DAPP");
		name.add("HAPP");
		name.add("FAPP");
		
		name.forEach(l->System.out.println("list elements=="+l));
		
		nameList();

	}

	public static void nameList() {
		List<String> nameList = new ArrayList<>();
		nameList.add("java 11 LTS");
		nameList.add("java 17 LTS");
		nameList.add("Java 21 LTS");
		nameList.add("Java 25 LTS");
		
		
		  nameList.forEach(a->{ System.out.println("Name List Elements="+a.toString());
		  
		  });
		  
		  //make the list upper case.
		  
		  List<String> lowerCaseList = Arrays.asList("java 11 LTS","java 17 LTS","java 21 LTS","java 25 LTS","java 29 LTS");
		  
		  lowerCaseList.forEach(a->System.out.println(a));
		  
		  List<String> upperCase = lowerCaseList.stream().map(String::toUpperCase).collect(Collectors.toList());
		  upperCase.forEach(u->System.out.println(u));
		  
		 
		
		
	}
}

package com.learn.app;

import java.util.ArrayList;
import java.util.List;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new ArrayList<>();
		name.add("CAPP");
		name.add("EAPP");
		name.add("DAPP");
		name.add("HAPP");
		name.add("FAPP");
		nameList();

	}

	public static void nameList() {
		List<String> nameList = new ArrayList<>();
		nameList.add("SANTPSH");
		nameList.add("AMIT");
		nameList.add("SUMIT");
		nameList.add("TAPAS");
		
		nameList.forEach(a->{
			System.out.println("Name List Elements="+a.toString());
			
		});
		
	}
}

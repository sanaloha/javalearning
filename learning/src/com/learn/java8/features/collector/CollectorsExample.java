package com.learn.java8.features.collector;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;


public class CollectorsExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pList = new ArrayList<>();
		pList.add(new Product(1,"Samsung",142.54f));
		pList.add(new Product(2,"Nokia",2345.5f));
		pList.add(new Product(3,"Azure",5343.24f));
		pList.add(new Product(4,"AWS",4534f));
		pList.add(new Product(5,"Gitlog",456.21f));
		getAsList(pList);
		convertAsSet(pList);

	}

	public static void getAsList(List<Product> pList) {
		
		
		List<Float> price = pList.stream().map(a->a.price).collect(Collectors.toList());
		System.out.println("prce List="+price);
	}
	public static void convertAsSet(List<Product> pList) {
		
		Set<Float> priceList = pList.stream().map(a->a.price).collect(Collectors.toSet());
		
		System.out.println("Price List="+priceList);
		
		//add id
		Integer sum = pList.stream().collect(Collectors.summingInt(a->a.id));
		System.out.println("Sum of ID="+sum);
		
		//avg price
		
		Double avgPrice = pList.stream().collect(Collectors.averagingDouble(a->a.price));
		System.out.println("AVG Price="+avgPrice);
		
		//number of elements.
		 Long count = pList.stream().collect(Collectors.counting());
		 System.out.println("Total elements=="+count);
		 
		 
		
		
		
	}
}

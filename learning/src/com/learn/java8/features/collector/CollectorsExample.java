package com.learn.java8.features.collector;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
		pList.add(new Product(5,"Gitlog",4534f));
		pList.add(new Product(6,"Gitlog",4534f));
		pList.add(new Product(7,"Azure",5343.24f));
		getPriceAsListAndMap(pList);
		convertAsSet(pList);
		getLowestPriceItem(pList);
		convertAsMap(pList);
		getDuplicateItems(pList);

	}

	private static void getDuplicateItems(List<Product> pList) {
		
		Set<String> name = new HashSet<>();
		Set<Product> prodSet = new HashSet<>();
		
		List<String> noDupList = pList.stream().map(p->p.getName()).filter(n->!name.add(n)).collect(Collectors.toList());
		System.out.println("Duplicate Item "+noDupList);
		List<Product> noDuplicateList = pList.stream().filter(p->!prodSet.add(p)).collect(Collectors.toList());
		System.out.println("No Dup Product=="+noDuplicateList);
	}

	public static void getPriceAsListAndMap(List<Product> pList) {
		
		List<Float> priceList = pList.stream().map(p->p.getPrice()).collect(Collectors.toList());
		System.out.println("priceList "+priceList);
		
		Set<Float> priceListSet = pList.stream().map(p->p.getPrice()).collect(Collectors.toSet());
		priceListSet.forEach(p->System.out.println("Price list Map=="+p));
		
	}
	
	//get product of the lowest price from the list
	public static void getLowestPriceItem(List<Product> pList) {
		
		pList.forEach(a->System.out.println("List of products "+a));
		
		Optional<Product> minPricePrdocut = pList.stream().min(Comparator.comparingDouble(p->p.getPrice()));
	
		minPricePrdocut.ifPresent(p->System.out.println("Minimum priced prdcut name= "+p));
	}
	
	public static void convertAsMap(List<Product> pList) {
		
		Map<Integer, Product> prodmap = pList.stream().collect(Collectors.toMap(p->p.getId(), p->p));
		
		System.out.println("Product Map==="+prodmap);
		
	}
	
	public static void convertAsSet(List<Product> pList) {
		
		Set<Product> productSet = pList.stream().map(p->p).collect(Collectors.toSet());
		
		System.out.println("Product set="+productSet);
		
		Set<Product> prodList = pList.stream().filter(p->p.getPrice()>300).collect(Collectors.toSet());
		
		//add id
		Integer sum = pList.stream().collect(Collectors.summingInt(a->a.getId()));
		System.out.println("Sum of ID="+sum);
		
		//avg price
		
		Double avgPrice = pList.stream().collect(Collectors.averagingDouble(a->a.getPrice()));
		System.out.println("AVG Price="+avgPrice);
		
		//number of elements.
		 Long count = pList.stream().collect(Collectors.counting());
		 System.out.println("Total elements=="+count);
		 
		
	}
}

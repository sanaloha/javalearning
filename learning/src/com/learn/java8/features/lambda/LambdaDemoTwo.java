package com.learn.java8.features.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(1,"SAMSUNG",1488f));
		prodList.add(new Product(2,"SONY",14000f));
		prodList.add(new Product(3,"BRAVIA",20200f));
		prodList.add(new Product(4,"LENOVO",1000f));
		
		Stream<Product> prodStream = prodList.stream().filter(p->p.price>12000);
		prodStream.forEach(p->System.out.println("Product name "+p.name+" prod price "+p.price));
		
		//sorting
		Collections.sort(prodList,(p1,p2)->{
			return p1.name.compareTo(p2.name);
			
		});
		
		prodList.forEach(p->System.out.println("Productc"+p.name));
		
		

	}

}

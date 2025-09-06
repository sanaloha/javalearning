package com.learn.app.design.behavioral.strategy.sorting;

import java.util.Arrays;

/***This class will select at runtime which sorting algorithm to chose**/
public class SortingDemo {
	
	public static void main(String[] args) {
		
		//create input which need to sort
		//Create Sortable which will have sort method
		Integer[] arr = {23,4,-6,77,-11,5};
		sort(arr,"Selection");
		sort(arr,"Bubble");
		sort(arr,"");
		
		
		//mergesort
		
	}
public static void sort(Integer[] arr,String type) {
	
	Sortable sortableObj = switch(type){
	case "Selection" ->new SelectionSort();
	case "Bubble" ->new BubbleSort();
	default ->new SimpleSort();
	
	};
	
	SortingApp app = new SortingApp(sortableObj);
	Integer[] result = app.sortData(arr);
	System.out.println("Sorted Array="+Arrays.toString(result));
}

}

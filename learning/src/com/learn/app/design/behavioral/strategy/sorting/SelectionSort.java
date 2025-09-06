package com.learn.app.design.behavioral.strategy.sorting;

import java.util.Arrays;

public class SelectionSort implements Sortable {

	@Override
	public Integer[] sort(Integer[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Selection Sort");
		if(arr == null || arr.length<=1)
			return null;
		
		//23,4,-6,-25,44,99,-11,5
		//here j is unsorted index
		
		for(int unsortedIndex=arr.length-1;unsortedIndex>0;unsortedIndex--) {
			int largestIndex=0;
			
			for(int i=1;i<=unsortedIndex;i++) {
				if(arr[i] > arr[largestIndex])
					largestIndex =i;
			}
			swap(arr,largestIndex,unsortedIndex);
		}
		return arr;
	}
	
	public void selectionSort() {
		
	}

}

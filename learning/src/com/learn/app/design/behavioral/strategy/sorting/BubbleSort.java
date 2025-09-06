package com.learn.app.design.behavioral.strategy.sorting;

public class BubbleSort implements Sortable{

	@Override
	public Integer[] sort(Integer[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Bubble Sort");
		if(arr == null || arr.length <=1)
			return null;
		
		for(int j=arr.length-1;j>=0;j--) {
			
			for(int i =0;i<j;i++) {
				if(arr[i]>arr[i+1])
					swap(arr,i,i+1);
			}
			
		}
		return arr;
	}

}

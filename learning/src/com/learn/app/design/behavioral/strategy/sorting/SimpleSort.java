package com.learn.app.design.behavioral.strategy.sorting;

public class SimpleSort implements Sortable {

	@Override
	public Integer[] sort(Integer[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Simple Sort");
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
			
		}
		return arr;
	}

}

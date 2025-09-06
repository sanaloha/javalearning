package com.learn.app.design.behavioral.strategy.sorting;

public interface Sortable {
	public Integer[] sort(Integer[] arr);
	
	public default void swap(Integer arr[],Integer i, Integer j) {
		
		if(i==j)
			return;
		int tmp = arr[i];
		arr[i] =arr[j];
		arr[j]=tmp;
		
	}
}

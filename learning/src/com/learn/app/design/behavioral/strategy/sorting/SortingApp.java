package com.learn.app.design.behavioral.strategy.sorting;

public class SortingApp {
	Sortable sortObj;
	
	public SortingApp(Sortable obj) {
		sortObj = obj;
		
	}
	public Integer[] sortData(Integer[] arr) {
		return this.sortObj.sort(arr);
	}

}

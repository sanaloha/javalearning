package com.learn.app.sort;

import java.util.Arrays;

/**
 * In general selection sort is better than bubblesort as it does less swap
 * Hence little faster and easier to traverse.
 * with a time complexity of O(n2) i.e O nsquare
 * Selection Sort is generally better than Bubble Sort because it performs 
 * fewer swaps, which can make it slightly faster in practice.
 * 
 * 
 */
public class SortDemo {
	
	public static void main(String[] args) {
					
		int[] arr = {23,4,-6,77,-11,5};
		bubbleSortTrial(arr);
		
		//itr 1 {20,-76,25,-22,55}
		//itr 2 {-76,20,-22,25,55}
		//itr 3 {-76,-22,20,25,55}
		
		int[] arrSelection = {23,4,-6,-25,44,99,-11,5};
		selectionSortTrial(arrSelection);
					
		}
		
/*
 * 1. Compare elements with its adjacent element
 * 2. Swap the largest one.
 */
	public static void bubbleSortTrial(int arr[]) {
		System.out.println("UnSorted Array="+Arrays.toString(arr));
			
		if(arr == null || arr.length <=1)
			return;
		
		for(int j=arr.length-1;j>=0;j--) {
			
			for(int i =0;i<j;i++) {
				if(arr[i]>arr[i+1])
					swap(arr,i,i+1);
			}
			
		}
		
		System.out.println("Sorted Array="+Arrays.toString(arr));
		
	}
	
	/**
	 * 1. Assume Unsorted Index
	 * 2. Find the largest index
	 * 3. Swap unsorted index
	 * @param arr
	 */

	public static void selectionSortTrial(int arr[]) {
		if(arr == null || arr.length<=1)
			return;
		
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
		System.out.println("Selection Sorted Array="+Arrays.toString(arr));
		
	}
	
	public static void swap(int arr[],int i, int j) {
		
		if(i==j)
			return;
		int tmp = arr[i];
		arr[i] =arr[j];
		arr[j]=tmp;
		
	}
	
	
	

}

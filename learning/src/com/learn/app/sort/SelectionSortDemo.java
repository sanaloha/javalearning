package com.learn.app.sort;

public class SelectionSortDemo {
	
	public static void main(String[] args) {
		
		int loopCount=0;
		
		int[] arr = {1, 2 ,3,4,5};
		
		//int[] arr = {20, 25 ,-76,55,-22};
		
		
		
		for(int unsortedIndex=arr.length-1;unsortedIndex>0;unsortedIndex--) {
			loopCount++;
			int largestIndex=0;
			
			for(int i=1;i<=unsortedIndex;i++) {
				loopCount++;
				if(arr[i]>arr[largestIndex]) {
					largestIndex=i;
				}
			}
			swap(arr,largestIndex,unsortedIndex);
		}
		
		System.out.println("Loop Count"+loopCount);
		//print the array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		
		if(i==j)
			return;
					
		int tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem;
	}

}


package com.learn.app.arrays;

import java.util.Arrays;

public class ArrayInitialization {
	
	/**
	 * Arrays can hold limited number of elements.
	 * Array elements are contagious in the memory.
	 * why array index starts from 0?
	 * There are different kinds of arrays we have
	 * Array is a box which can use to hold the similar kind of data, 
	 * you don't have to create variable to hold each data. Just create
	 *  one box nd put everything there.
	 * 
	 * With this class you will learn
	 * 1. How to update size of an array dynamically
	 * 2. Merging of two elements
	 * 3. Removing array from any position
	 * 4. Copy of an array always point to the same memory location, so when u make changes in the 
	 * elements of the copy original array will also be impacted
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//playWithArrays();
		deleteElement();
		//mergeIntervals();
		//sortArrays();
		
				

	}
	
	private static void sortArrays() {
		int loopcount=0;
		
		Integer[] arr = {22,34,11,44,33,32,55,80,60};
		
		System.out.println("====SORT ARRAY========================");
		
		for(int i=0;i<arr.length-1;i++) {
			loopcount++;
			for(int j=i+1;j<=arr.length-1;j++) {
				loopcount++;
				int temp=0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println("Sorted Array="+Arrays.deepToString(arr));
		
		System.out.println("==========loop count============="+loopcount);
	}
	
	private static void mergeIntervals() {
		// TODO Auto-generated method stub
		
		System.out.println("=============mergeIntervals==================");
		
		Integer[][] intervals1 = {{1,3},{2,6},{8,10},{15,18},{16,19}};
		//Integer[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
		/**Below way of assigning arrays will result into creating new array reference
		 * pointing to the same memory location**/
		//Integer[][] tempInterval = intervals1;
		//Integer[][] tempInterval = Arrays.copyOf(intervals1, intervals1.length);
		
		Integer[][] tempInterval = {{1,3},{2,6},{8,10},{15,18},{16,19}};
		/*
		 * Integer[][] tempInterval = new Integer[intervals1.length][];
		 * 
		 * for(int i=0;i<intervals1.length;i++) { tempInterval[i] = intervals1[i];
		 * 
		 * }
		 */
		System.out.println("intervals1 Arrays=="+ Arrays.deepToString(intervals1));
		System.out.println("temp Arrays=="+ Arrays.deepToString(tempInterval));
			
		Integer[][] newInterval = new Integer[intervals1.length-1][2];
		
		for(int i=0;i<intervals1.length;i++) {
			
			if(i!=intervals1.length-1) {
			
			if(tempInterval[i] !=null && ++tempInterval[i][0] == tempInterval[i+1][0]) {
				System.out.println("Found match");
				newInterval[i][0] =intervals1[i][0];
				newInterval[i][1] =intervals1[i+1][1];
				
				//mark next element as null
								
			}else {
				newInterval[i] =  intervals1[i+1];
			}
			}
		}
		
		System.out.println("newInterval Arrays=="+ Arrays.deepToString(newInterval));
		System.out.println("======mergeIntervals Ends=========");
	
	}
	
	/**
	 * Write a program to delete an element from an array
	 * and update the size of the array with the count of
	 * remaining elements 
	 * @args no
	 * @return void
	 * 
	 * **/
	public static void deleteElement() {
		
		System.out.println("======Delete 1st element from Array=========");
		
		Integer[] intArr = {22,32,13,45,66};
		System.out.println("Input Array=="+ Arrays.deepToString(intArr));
							
		removeElement(6,intArr);
			
		intArr = Arrays.copyOf(intArr, intArr.length-1);
		
		System.out.println("Updated Array=="+ Arrays.deepToString(intArr));
		System.out.println("==============deleteElement ends========================");	
		
	}
	
	public static Integer[] removeElement(int index, Integer[] arr){
		if(index <= arr.length) {
						
			for(int i =index;i<arr.length-1;i++) {
				arr[i] = arr[i+1];
				
			}
		}
		
		return arr;
		
	}

	public static void playWithArrays() {
		

		Integer[] numArr = new Integer[4];
		numArr[0] =10;
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] =i+10;
			//System.out.println("Array element=="+numArr[i]);
		}
				
		Integer[][] twoDimArr = new Integer[2][3];
			
		twoDimArr[0][0] = 1;
		twoDimArr[0][1] = 2;
		twoDimArr[0][2] = 3;
		
		twoDimArr[1][0] = 4;
		twoDimArr[1][1] = 5;
		twoDimArr[1][2] = 6;
		
		Integer[] repArray = {7,8,9};
			
		for(int i=0;i<twoDimArr.length;i++) {
			System.out.println("Arrays=="+ Arrays.deepToString(twoDimArr[i]));
			//replace the first array
			if(i==1) {
				twoDimArr[i] = repArray;
				System.out.println("Replaced Array=="+ Arrays.deepToString(twoDimArr[i]));
			}
			
				
		}
		
		
	}

}

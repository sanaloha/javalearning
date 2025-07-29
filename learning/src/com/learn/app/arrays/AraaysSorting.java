package com.learn.app.arrays;

import java.util.Arrays;

public class AraaysSorting {
	
	public static void main(String[] args) {
		int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
		
		System.out.println("Input="+Arrays.deepToString(intervals1));
		//System.out.println("Output: " + Arrays.deepToString(sol.merge(intervals1)));
		
		//Arrays.sort(intervals1, (i1, i2) -> Integer.compare(i1[0], i2[0]));
		//System.out.println("output="+Arrays.deepToString(intervals1));
		
		int tempElement;
		int tempElement2;
		int[] tempArray = new int[2];
		
		for(int i=0;i<intervals1.length-1;i++) {
			tempElement = intervals1[i][0];
			tempElement2 = intervals1[i+1][0];
			
			if(++tempElement == tempElement2) {
				System.out.println("tempElement"+tempElement);
				tempArray[i] = intervals1[i][0];
				tempArray[i+1] = intervals1[i+1][1];
				intervals1[i] = tempArray;
				//intervals1[i+1]="";
				
			}
		}
		System.out.println("temp array="+Arrays.toString(tempArray));
		System.out.println("Output="+Arrays.deepToString(intervals1));
	}
		
	
		// TODO Auto-generated method stub
	//
    //System.out.println("Output: " + Arrays.deepToString(sol.merge(intervals1))); 

}

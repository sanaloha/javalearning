package com.learn.java8.features.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListQNA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr = {44,55,11,9,14};
		convert(intArr);
		List<Integer> grades = Arrays.asList(4,73,67,38,33);
		gradingStudents(grades);
		

	}
	
	public static void convert(Integer[] arr) {
		
		List<Integer> numList = Arrays.asList(22,111,33,9,40);
		List<Integer> numList2 = Arrays.asList(arr);
		System.out.println("list=="+numList2);
		
		
		
	}
	
	public static void listToArray() {
		
	}
	/**
	 * HackerRank Grading Students
	 * **/
	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		
		 List<Integer> newGrades = new ArrayList<>();
		    int nextGrade=0;
		    int marks=0;
		    for(int i=0;i<grades.size();i++){
		        marks = grades.get(i);
		        if(marks>=38){
		            nextGrade = (marks/5+1)*5;
		            if(nextGrade - marks <3)
		                marks = nextGrade;
		       }
		        newGrades.add(marks);
		        
		        
		       }   
		   System.out.println(newGrades);
		    return newGrades;

	}
	
/**
 * HackerRank
 * Apples and Orange
 * 
 * 
 * **/
	 public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		    // Write your code here
		    
		     List<Integer> appleLandingArr = apples.stream().map(n->n+a).collect(Collectors.toList());
		     List<Integer> orangeLandingArr = oranges.stream().map(o->o+b).collect(Collectors.toList());
		     
		     int applecount = getCount(appleLandingArr,s,t);
		     int orangecount = getCount(orangeLandingArr,s,t);
		    System.out.println(applecount);
		    System.out.println(orangecount);
		    
		    }
		public static int getCount(List<Integer> lst,int s,int t){
		    int count =0;
		    for(Integer ele:lst){
		        if(ele>=s &&ele<=t)
		        count++;
		    }
		    return count;
		}
		
/**
 * 
 * Number Line Jumps
 * ****/
public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    int posDiff = (x2 - x1);
    int velDiff = (v1 - v2);
        
    if((v1>v2) && (posDiff%velDiff==0))
        return "YES";
        
    return "NO";

    }
	
}

/**
 * Between two sets
 * 
 * 
 **/

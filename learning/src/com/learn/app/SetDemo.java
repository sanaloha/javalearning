package com.learn.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set Does not allow duplicates
 * <HashSet> does not maintain any order
 * <LinkedHasSet> maintains the order in which objects are inserted
 * Allows null value, maintains a doubly-linked List across all elements.
 * Both HashSet and LinkedHashset are unsorted, best suited for iteration order, order here is not unpredictable
 * <TreeSet> is a sorted set, it does not allow duplicates.
 * <TreeSet> maintains the natural order. It uses a Red-Black tree structure
 * 
 * Watch When using HashSet or LinkedHashSet, the objects you add to them 
	must override hashCode(). If they don’t override hashCode(), the default Object.
 	hashCode() method will allow multiple objects that you might consider "meaningfully 
	equal" to be added to your "no duplicates allowed" set. 
 * **/
public class SetDemo {
public static void  main(String[] args) {
	
	Set<String> myset = new HashSet();
	
	myset.add("Santosh");
	myset.add("Amit");
	myset.add("KMN");
	myset.add(null); //null allowed
	myset.add("Santosh"); //doesn't give the compiler error but it will filter duplicate.
	myset.add("SAntosh"); //allowed duplicate as it is not case sensitive.
	
	System.out.println("SET Unordered"+myset);
	//[null, SAntosh, Amit, KMN, Santosh] - means does not maintain the order
	Set<String> linkedSet = new LinkedHashSet<String>();
 
	 linkedSet.add("Santosh");
	 linkedSet.add("Amit");
	 linkedSet.add("KMN");
	 linkedSet.add(null); //null allowed
	 linkedSet.add("Santosh"); //doesn't give the compiler error but it will filter duplicate.
	 linkedSet.add("SAntosh");
	 System.out.println("Linked Has Set Ordered="+linkedSet);
	 //[Santosh, Amit, KMN, null, SAntosh]
	 
	 System.out.println("Convert LHS to Array"+Arrays.toString(linkedSet.toArray()));
	 
	 Set<String> sorted = new TreeSet();
	 sorted.add("Santosh");
	 sorted.add("Amit");
	 sorted.add("KMN");
	 //soretd.add(null); //null not allowed, compiler error
	 sorted.add("Santosh"); //doesn't give the compiler error but it will filter duplicate.
	 sorted.add("SAntosh");
	 System.out.println("Sorted or Tree Set"+sorted);
	 //[Amit, KMN, SAntosh, Santosh]
	
	
	 
	 
	 
	
}
	
}

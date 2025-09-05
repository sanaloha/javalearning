package com.learn.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * List is a collection which maintains the insertion order initially and then order by index position
 * It is an unsorted collection.
 *  Allows duplicates, null values
 * ArrayList gives faster iteration and fast random access. It implements the marker interface called RandomAccess
 * ***Choose this  over a LinkedList when you need fast iteration but aren't as likely to be doing a lot of insertion and deletion
 *<Vecttor> Synchronized version of [ArrayList]
 * <linkedList>  elements are doubly-linked to one another.
 * LL Allows adding and removing from the beginning or end,hence used for implementing stack or queue.
 *  LinkedList may iterate more slowly than an ArrayList, but insertion and deletion are fast.
 * 
 * **/
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name = new ArrayList<String>();
		name.add("Santosh");
		name.add("Amit");
		name.add("SAntosh");
		name.add(null);
		name.add("Santosh");
		name.add(null);

		System.out.println(name);
		//[Santosh, Amit, SAntosh, null, Santosh]
		name.add(3,"Samit");
		System.out.println(name);
		
		List<String> namel = new LinkedList<String>();
		namel.add("Santosh");
		namel.add("Amit");
		namel.add("SAntosh");
		namel.add(null);
		namel.add("Santosh");
		namel.add(null);
		
		System.out.println(namel);
		////[Santosh, Amit, SAntosh, null, Santosh]
		namel.add(3,"Samit");
		System.out.println(namel);
		
		

	}

}

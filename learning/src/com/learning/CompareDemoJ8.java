package com.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CompareDemoJ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Comparator<StudentDemo> compStud = new Comparator<StudentDemo>(){
//
//			@Override
//			public int compare(StudentDemo stud1, StudentDemo stud2) {
//				// TODO Auto-generated method stub
//				return stud1.getAge() >stud2.getAge()?1:-1;
//			}
//			
//		};
		
				
		Comparator<StudentDemo> compStud = (i,j)->i.getAge()>j.getAge()?1:-1;
		List<StudentDemo> studList = Arrays.asList(new StudentDemo("santosh",45),new StudentDemo("sumeet",42),new StudentDemo("Amit",35),new StudentDemo("RAM",41));
		Collections.sort(studList,new StudentComparator());
		studList.forEach(a->System.out.println("Sorted List"+a));
		
		Comparator<StudentDemo> compByName = (a,b)->a.getName().equals(b.getName())?1:-1;
		
		StudentDemo stud01 = new StudentDemo("SAn",22);
		StudentDemo stud02 = new StudentDemo("SAn",23);
		System.out.println("Compare =="+compByName.compare(stud01, stud02));
		
		Comparator<StudentDemo> studcom = Comparator.comparing(StudentDemo::getAge);
		System.out.println("Compare Age=="+studcom.compare(stud01, stud02));
				
		//Create a new list and see if the students and ordered and sorted based on age.
		//as we the class implements comparable
		
		StudentDemo stud1 = new StudentDemo("Mark Mason",47);
		StudentDemo stud2 = new StudentDemo("Margo Lippiq",23);
		StudentDemo stud3 = new StudentDemo("Jane Frasen",22);
		StudentDemo stud4 = new StudentDemo("Tim Ryan",18);
		
		Set<StudentDemo> demoList = new LinkedHashSet();
		demoList.add(stud1);
		demoList.add(stud2);
		demoList.add(stud3);
		demoList.add(stud4);
		
		System.out.println("Student list="+demoList); //no
		
		
		
		
		

	}

}

class StudentDemo implements Comparable<StudentDemo>{
	
	public StudentDemo(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	String name;
	Integer age;
	@Override
	public int compareTo(StudentDemo that) {
		
//		if(this.age > that.getAge())
//			return 1;
//		else
//			return -1;
		return this.age >that.getAge()?1:-1;
	}
		
}

class StudentComparator implements Comparator<StudentDemo>{

	@Override
	public int compare(StudentDemo o1, StudentDemo o2) {
		// TODO Auto-generated method stub
		return ((com.learning.StudentDemo) o1).getName().compareToIgnoreCase(o2.name);
	}
	
}
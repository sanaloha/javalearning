package com.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		Collections.sort(studList,compStud);
		studList.forEach(a->System.out.println(a));

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
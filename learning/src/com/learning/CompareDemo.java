package com.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person per1 = new Person("Santosh",43);
		Person per2 = new Person("Santosh",43);
		System.out.println("Equal Persons=="+per1.equals(per2));
		
		List<Integer> numb = Arrays.asList(41,45,77,82,33,88);
		
		List<Student> studList = Arrays.asList(new Student("santosh",45),new Student("sumeet",42),new Student("Amit",35),new Student("RAM",41));
		Collections.sort(studList);
		for(Student stud:studList) {
			System.out.println(stud);
		}
		
		Collections.sort(numb);
		for(Integer n:numb) {
			System.out.println(n);
		}
		NumberCompare com = new NumberCompare();
		
		Collections.sort(numb,com);
		for(Integer n:numb) {
			System.out.println("sorted "+n);
		}
		

	}

}

class NumberCompare implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {

		return num1%10 >num2%10?1:-1;
	}
	
	
}

class Student implements Comparable<Student>{
	
	public Student(String name, Integer age) {
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
	public int compareTo(Student that) {
		
//		if(this.age > that.getAge())
//			return 1;
//		else
//			return -1;
		return this.age >that.getAge()?1:-1;
	}
}

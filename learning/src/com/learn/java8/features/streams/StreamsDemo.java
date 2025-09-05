package com.learn.java8.features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collections.sort(null);
		
		List<Integer> numList = Arrays.asList(17,4,7,21,1,3,9);
		
		Predicate<Integer> pred = new Predicate<>() {

			@Override
			public boolean test(Integer n) {
			return n%2==1;
			}
			
		};
		//convert above whole statement into a single line using lambda expression`
		Predicate<Integer> predLamd = n-> n%2==1;
	//	System.out.println("Test Result="+predLamd.test(8));
		
		Stream<Integer> data = numList.stream();

		//data.forEach(n->System.out.println(n));
		//numList.forEach(a->System.out.println(a));
		
				
		//create another stream
		Stream<Integer> data1 = numList.stream();
		
		long count = data1.count();
		System.out.println("Total count =="+count);
		//Below stmt will give you the exception as stream data1 is already used.
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		
		//data1.forEach(b->System.out.println(b));
		//create another stream
		Stream<Integer> newData = numList.stream();
		Stream<Integer> sortedData = newData.sorted();
		
		Stream<Integer> dataToMap = numList.stream();
		Stream<Integer> mapData =  dataToMap.map(n->n*n);
		
		//sortedData.forEach(s->System.out.println("sorted Data=="+s));
		//mapData.forEach(m->System.out.println("map data=="+m));
		//use of reduce
		int addition = numList.stream().reduce(0, Integer::sum);
		System.out.println("Sum of all numbers"+addition);
		List<Integer> oddList = numList.stream().filter(n->n%2==1).sorted().toList();
		System.out.println("ODD List=="+oddList);
		
		List<Integer> multipleofTwo = numList.stream().filter(n->n%2==1).sorted().map(n->n*2).toList();
		System.out.println("ODD List=="+multipleofTwo);
		
		int result = numList.stream().filter(n->n%2==1).sorted().map(n->n*2).reduce(0, (c,e)->c+e);
		
		System.out.println("Result=="+result);
		
		// WAP using a stream to find frequency of a character in a given String.
		
		String input = "Santoshsinghs";
		
		//split this into array of streams with ""
		
		
		Map<String,Long> countMap =	Arrays.stream(input.split("")).collect(
												Collectors.groupingBy(
												Function.identity(),Collectors.counting()
												)
										);
	
	System.out.println("Count Map="+countMap);
		
		
	//Assume you have List of employee in a various departments WAP to find the highest paid employee from each department
	
	List<Employee> employees = Stream.of(
				new Employee(1,"SAN","QA",90000),
				new Employee(2,"Samit","QA",50000),
				new Employee(3,"Amit","DEV",80000),
				new Employee(4,"SDRTUNGAN","DEV",45000),
				new Employee(5,"ANTYRU","HR",70000),
				new Employee(6,"OPTANGH","HR",75000),
				new Employee(7,"GABGA","PO",65000),
				new Employee(8,"DEROTY","DEV",85000)
				).collect(Collectors.toList());
	
	//approach1
	
	Comparator<Employee> compSal = Comparator.comparing(Employee::getSalary);
	
	
	Map<String, List<Employee>> empMap =  employees.stream().collect(Collectors.groupingBy(
			Employee::getDept
		));
	
	Map<String, Optional<Employee>> CollectSal =  employees.stream().collect(Collectors.groupingBy(
			Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(compSal)))
			);
	
	System.out.println(empMap);
	
	
	
	System.out.println(CollectSal);
	
	Map<String, Employee> empMaxSal = employees.stream().collect(
			Collectors.groupingBy(
					Employee::getDept, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),Optional::get)
						));
	
	System.out.println(empMaxSal);	
	
	//Stream vs parallel stream: For read op u can use the parallel stream but for write always use stream
		//stream runs on single core in main threads
		
	//IntStream.rangeClosed(1, 10).forEach(t->System.out.println(Thread.currentThread().getName()+t));
		
//	IntStream.rangeClosed(1, 10).parallel().forEach(t->System.out.println(Thread.currentThread().getName()+":"+t));
		
	}
	
}

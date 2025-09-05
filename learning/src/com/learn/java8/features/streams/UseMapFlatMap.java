package com.learn.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMapFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<User> users = Stream.of(
					new User("Santosh","869438373849",Arrays.asList("abc@tr.com,def@tr.com")),
					new User("Amit","8734573485",Arrays.asList("hjg@tr.com","afsfs@tr.com","adafsa@tr.com"))
				).collect(Collectors.toList());
		
		//Gather all the ph no of all the user.
		
	List<String> phoneNumbers = users.stream().map(User::getPhone).collect(Collectors.toList());
	
	phoneNumbers.forEach(s->System.out.println(s));
	
	List<List<String>> emails =  users.stream().map(User::getEmail).collect(Collectors.toList());
	emails.forEach(e->System.out.println("email"+e) );
	
	List<String> email = users.stream().flatMap(u->u.getEmail().stream()).collect(Collectors.toList());
	email.forEach(e->System.out.println(e));
	
	colletUserInfo();

	}
	
	public static void colletUserInfo() {
		
		List<User> userInfo = Stream.of(new User("Santosh","88383938",Arrays.asList("abc@gmail.com","dfg@gmail.com","mac@gmail.com")),
				new User("Samit","8877373",Arrays.asList("ythr@gmail.com","htyr@gmail.com","sam@gmail.com"))).collect(Collectors.toList());
	//get all user names.
		List<String> names = userInfo.stream().map(u->u.getName()).toList();
		System.out.println("Users"+names);
		
		List<List<String>> emailgroup = userInfo.stream().map(u->u.getEmail()).toList();
		System.out.println("EMAILs"+emailgroup);
		List<String> emails = userInfo.stream().flatMap(a->a.getEmail().stream()).toList();
		System.out.println("EMAILs"+emails);
		
	
	}

}

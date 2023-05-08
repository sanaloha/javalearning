package com.learn.java8.features.functional;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	
	public static List<UserPre> getAllUsers(){
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<UserPre> users = getAllUsers();
		
		users.removeIf(new Predicate<UserPre>() {

			@Override
			public boolean test(UserPre user) {
				// TODO Auto-generated method stub
				return user.isActive();
			}
			
			
		});
		
		users.removeIf(a->a.isActive());

	}

}

class UserPre{
	
	public boolean isActive() {
		return true;
	}
}

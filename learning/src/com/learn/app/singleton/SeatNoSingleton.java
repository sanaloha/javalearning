package com.learn.app.singleton;

import java.util.HashSet;
import java.util.Set;

public class SeatNoSingleton {

	Set<String> available;
	
	public SeatNoSingleton() {
		
		available = new HashSet<>();
		available.add("Seat1");
		available.add("Seat2");
	}
	
	public boolean book(String seat) {
		if(available!=null)
			return available.remove(seat);
			
		return false;
	}
	
	public static void bookSeat(String seat) {
		SeatNoSingleton seatObj = new SeatNoSingleton();
		System.out.println("Seat "+seat+" booked "+seatObj.book(seat));
		
	}
	
	public static void main(String[] args) {
		
		bookSeat("Seat1");
		bookSeat("Seat1");
		

	}

}

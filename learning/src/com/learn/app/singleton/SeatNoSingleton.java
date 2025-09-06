package com.learn.app.singleton;

import java.util.HashSet;
import java.util.Set;

public class SeatNoSingleton {
	
	private static SeatNoSingleton singletonObj;

	private Set<String> available;
	
	private SeatNoSingleton() {
		
		if(available == null)
			available = new HashSet<>();
		addSeats();
		
		
	}
	
	public static SeatNoSingleton  getInstance() {
		try {
			if(singletonObj !=null) {
				return singletonObj;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		singletonObj = new SeatNoSingleton();
		return singletonObj;
	}
	
	private void addSeats() {
		this.available.add("Seat1");
		this.available.add("Seat2");
	}
	public boolean book(String seat) {
		if(available!=null)
			return available.remove(seat);
			
		return false;
	}
	
	public static void bookSeat(String seat) {
		SeatNoSingleton seatObj = getInstance();
		System.out.println("Seat "+seat+" booked "+seatObj.book(seat));
		
	}
	
	public static void main(String[] args) {
		
		
		bookSeat("Seat1");
		bookSeat("Seat1");
		

	}

}

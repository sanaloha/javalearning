package com.learn.app.jmm;

public class MemoryModel {

	public static void main(String[] args) {
		/**
		 	            Instructions
			a = 3;      ->load a ->set to 3 ->store a
			b = 2;      ->load b ->set to 2 ->store b
			a = a +1;  	->load a ->set to 4 ->store a
			
		               Instructions
			a = 3;     ->load a ->set to 3
			a = a +1;  ->set to 4 ->store a
			b = 2;     ->load b ->set to 2 ->store b
			
		
			
		
		**/

	}

}

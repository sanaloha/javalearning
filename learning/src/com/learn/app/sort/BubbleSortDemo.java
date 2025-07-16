package com.learn.app.sort;

public class BubbleSortDemo {
	
	public static void main(String[] args) {
		
		int loopCount=0; //to see the performance
		
		//int[] intArr = {1, 2 ,3,4,5};
		
		int[] intArr = {20, 25 ,-76,55,-22};
		 							//lui
		
		//itr 1 {20,-76,25,-22,55}
		                //lui
		//itr 2 {-76,20,-22,25,55}
		 			//lui
		
		//itr 3 {-76,-22,20,25,55}
		 		//lui
		
			
		for(int lastUnsortedIndex = intArr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			loopCount++;
			for(int i =0;i<lastUnsortedIndex;i++) {
				loopCount++;
				
				if(intArr[i] >intArr[i+1]) {
					swap(intArr,i,i+1);
					
				}
			}
			for(int j=0;j<intArr.length;j++) {
				System.out.println("int array["+lastUnsortedIndex+"]"+intArr[j]);
			}
			System.out.println("New Line");
			
			
		}
		
		//System.out.println("Loop count"+loopCount);
		
		//print the array
		
		for(int i=0;i<intArr.length;i++) {
			//System.out.println(intArr[i]);
		}
			
		
		
		
	}
	
	public static void swap(int arr[],int i, int j) {
		
		if(i==j)
			return;
		int tmp = arr[i];
		arr[i] =arr[j];
		arr[j]=tmp;
		
	}

}

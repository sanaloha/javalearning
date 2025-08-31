package com.learn.app.timespace;

public class BinarySearch {

	public static void main(String[] args) {
			
		int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(arr, 7)); // O(log n)
        
        
        //merge sort
        int[] arr1 = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) System.out.print(num + " ");

	}
	
	/**
	 * O(log n) – Logarithmic Time
	 * **/
	public static int binarySearch(int[] arr, int target) {
		
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
	
	/**
	 * Constant time
	 * O(1) – Constant Time
	 * Accessing an array element by index.
	 * **/
public void constantTime() {
	
	 int[] arr = {10, 20, 30, 40};
     System.out.println(arr[2]); // O(1)
}

/***
 * O(n) – Linear Time
 * 
 * Finding the maximum element in an array.	
 * */
	

public static int findMax(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
        if (num > max) max = num;
    }
    return max;
}

/**
 * 
 * O(n log n) – Log-Linear Time
 * Merge Sort example.
 * 
 * 
 * **/
public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

private static void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) L[i] = arr[left + i];
    for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) arr[k++] = L[i++];
        else arr[k++] = R[j++];
    }
    while (i < n1) arr[k++] = L[i++];
    while (j < n2) arr[k++] = R[j++];
}

}

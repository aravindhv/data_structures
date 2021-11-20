//$Id$
package com.learn.array;

public class RotateArray {

	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7};
		int noOfShift = 3;
		System.out.println("Before Shift :: ");
		printArray(arr);
		rotateArray(arr, arr.length - 1, noOfShift);
		System.out.println("After Shift ::");
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void rotateArray(int []arr, int noOfElements, int noOfShift) {
		for(int i = 0; i < noOfShift; i++) {
			for(int j = 0; j < noOfElements; j++) {
				if(j < arr.length - 1) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}

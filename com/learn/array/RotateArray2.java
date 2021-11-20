//$Id$
package com.learn.array;

public class RotateArray2 {

	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5, 6, 7};
		int noOfShift = 3;
		RotateArray.printArray(arr);
		reverseArray(arr, 0, noOfShift - 1);
		reverseArray(arr, noOfShift, arr.length - 1);
		reverseArray(arr, 0, arr.length - 1);
		RotateArray.printArray(arr);
	}

	private static void reverseArray(int[] arr, int start, int end) {
		int i = start, j = end;
		while(i < j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
	}

}
